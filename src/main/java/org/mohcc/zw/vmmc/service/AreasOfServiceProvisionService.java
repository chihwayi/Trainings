package org.mohcc.zw.vmmc.service;

import org.mohcc.zw.vmmc.model.AreasOfServiceProvision;

import java.util.List;

public interface AreasOfServiceProvisionService {
    AreasOfServiceProvision saveAreasOfServiceProvision(AreasOfServiceProvision areasOfServiceProvision);
    AreasOfServiceProvision getAreasOfServiceProvisionById(String id);
    List<AreasOfServiceProvision> getAllAreasOfServiceProvisions();

    // Additional methods for business logic

}
