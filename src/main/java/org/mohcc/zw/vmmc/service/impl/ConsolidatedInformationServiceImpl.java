package org.mohcc.zw.vmmc.service.impl;

import org.mohcc.zw.vmmc.model.ConsolidatedInformation;
import org.mohcc.zw.vmmc.repository.ConsolidatedInformationRepository;
import org.mohcc.zw.vmmc.service.ConsolidatedInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsolidatedInformationServiceImpl implements ConsolidatedInformationService {

    private ConsolidatedInformationRepository consolidatedInformationRepository;

    @Autowired
    public ConsolidatedInformationServiceImpl(ConsolidatedInformationRepository consolidatedInformationRepository) {
        this.consolidatedInformationRepository = consolidatedInformationRepository;
    }

    @Override
    public List<ConsolidatedInformation> getAllConsolidatedInformation() {
        return consolidatedInformationRepository.findAllJoinedData();
    }
}
