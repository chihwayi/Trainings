package org.mohcc.zw.vmmc.service.impl;

import org.mohcc.zw.vmmc.model.FacilityDistrictProvince;
import org.mohcc.zw.vmmc.repository.FacilityDistrictProvinceRepository;
import org.mohcc.zw.vmmc.service.FacilityDistrictProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityDistrictProvinceServiceImpl implements FacilityDistrictProvinceService {

    private final FacilityDistrictProvinceRepository facilityDistrictProvinceRepository;

    @Autowired
    public FacilityDistrictProvinceServiceImpl(FacilityDistrictProvinceRepository facilityDistrictProvinceRepository) {
        this.facilityDistrictProvinceRepository = facilityDistrictProvinceRepository;
    }

    @Override
    public List<FacilityDistrictProvince> getFacilityDistrictProvinceData() {
        return facilityDistrictProvinceRepository.getFacilityDistrictProvinceData();
    }

}
