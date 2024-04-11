package org.mohcc.zw.vmmc.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FacilityDistrictProvince {
    @Id
    private String facilityId;
    private String districtId;
    private String provinceId;
    private String facilityName;
    private String districtName;
    private String provinceName;

    public FacilityDistrictProvince(String facilityId, String districtId, String provinceId, String facilityName, String districtName, String provinceName) {
        this.facilityId = facilityId;
        this.districtId = districtId;
        this.provinceId = provinceId;
        this.facilityName = facilityName;
        this.districtName = districtName;
        this.provinceName = provinceName;
    }

    public FacilityDistrictProvince() {

    }
}
