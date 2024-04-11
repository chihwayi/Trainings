package org.mohcc.zw.vmmc.service.impl;

import java.util.List;

import org.mohcc.zw.vmmc.model.Facilitator;
import org.mohcc.zw.vmmc.repository.FacilitatorRepository;
import org.mohcc.zw.vmmc.service.FacilitatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilitatorServiceImpl implements FacilitatorService{

	private final FacilitatorRepository facilitatorRepository;

	@Autowired
	public FacilitatorServiceImpl(FacilitatorRepository facilitatorRepository) {
		super();
		this.facilitatorRepository = facilitatorRepository;
	}

	@Override
	public Facilitator saveFacilitator(Facilitator facilitator) {
		return facilitatorRepository.saveAndFlush(facilitator);
	}

	@Override
	public Facilitator getFacilitatorById(String id) {
		return facilitatorRepository.findById(id).orElse(null);
	}

	@Override
	public List<Facilitator> getAllFacilitator() {
		return facilitatorRepository.findAll();
	}

	@Override
	public boolean existsById(String id) {
		return facilitatorRepository.existsById(id);
	}

}
