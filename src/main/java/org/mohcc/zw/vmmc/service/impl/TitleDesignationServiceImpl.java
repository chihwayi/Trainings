package org.mohcc.zw.vmmc.service.impl;

import java.util.List;

import org.mohcc.zw.vmmc.model.TitleDesignation;
import org.mohcc.zw.vmmc.repository.TitleDesignationRepository;
import org.mohcc.zw.vmmc.service.TitleDesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleDesignationServiceImpl implements TitleDesignationService{

	private TitleDesignationRepository titleDesignationRepository;

	@Autowired
	public TitleDesignationServiceImpl(TitleDesignationRepository titleDesignationRepository) {
		this.titleDesignationRepository = titleDesignationRepository;
	}

	@Override
	public List<TitleDesignation> getTitleDesignationData() {
		// TODO Auto-generated method stub
		return titleDesignationRepository.getTitleDesignationData();
	}
	

}
