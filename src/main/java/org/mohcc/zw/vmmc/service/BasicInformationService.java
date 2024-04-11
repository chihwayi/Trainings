package org.mohcc.zw.vmmc.service;

import org.mohcc.zw.vmmc.model.BasicInformation;

import java.util.List;

public interface BasicInformationService {
    BasicInformation saveBasicInformation(BasicInformation basicInformation);
    BasicInformation getBasicInformationById(String id);
    List<BasicInformation> getAllBasicInformation();
    List<BasicInformation> findAllData();
    boolean existsById(String id);
}
