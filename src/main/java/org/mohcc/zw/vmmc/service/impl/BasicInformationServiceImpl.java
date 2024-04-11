package org.mohcc.zw.vmmc.service.impl;

import org.mohcc.zw.vmmc.model.BasicInformation;
import org.mohcc.zw.vmmc.repository.BasicInformationRepository;
import org.mohcc.zw.vmmc.service.BasicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicInformationServiceImpl implements BasicInformationService {

    private final BasicInformationRepository basicInformationRepository;

    @Autowired
    public BasicInformationServiceImpl(BasicInformationRepository basicInformationRepository) {
        this.basicInformationRepository = basicInformationRepository;
    }

    @Override
    public BasicInformation saveBasicInformation(BasicInformation basicInformation) {
        // Add any business logic before saving
        return basicInformationRepository.save(basicInformation);
    }

    @Override
    public BasicInformation getBasicInformationById(String id) {
        return basicInformationRepository.findById(id).orElse(null);
    }

    @Override
    public List<BasicInformation> getAllBasicInformation() {
        return basicInformationRepository.findAll();
    }

    @Override
    public List<BasicInformation> findAllData() {
        return basicInformationRepository.findAllData();
    }
    
    @Override
    public boolean existsById(String basicInformationId) {
        return basicInformationRepository.existsById(basicInformationId);
    }


}
