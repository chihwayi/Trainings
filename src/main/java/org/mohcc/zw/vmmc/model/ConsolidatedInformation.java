package org.mohcc.zw.vmmc.model;


public class ConsolidatedInformation {

    // Fields from BasicInformation
    private String basic_information_id;
    private String name;
    private String surname;
    private String sex;
    private String designation;
    private String facility;
    private String district;
    private String province;

    // Fields from AreasOfServiceProvision
    private String service_area;
    private String trainer;

    // Fields from RemarksComments
    private String remarks;
    private String comments;

    // Fields from Training
    private String basic;
    private String fg_conversion;
    private String ds_conversion;
    private String certification;
    private String emergency;
    private String shangring;
    private String tot;
    private String refresher;

    public ConsolidatedInformation(String basic_information_id, String name, String surname, String sex, String designation, String health_centre, String district, String province, String service_area, String trainer, String remarks, String comments, String basic, String fg_conversion, String ds_conversion, String certification, String emergency, String shangring, String tot, String refresher) {
        this.basic_information_id = basic_information_id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.designation = designation;
        this.facility = health_centre;
        this.district = district;
        this.province = province;
        this.service_area = service_area;
        this.trainer = trainer;
        this.remarks = remarks;
        this.comments = comments;
        this.basic = basic;
        this.fg_conversion = fg_conversion;
        this.ds_conversion = ds_conversion;
        this.certification = certification;
        this.emergency = emergency;
        this.shangring = shangring;
        this.tot = tot;
        this.refresher = refresher;
    }

    public String getBasic_information_id() {
        return basic_information_id;
    }

    public void setBasic_information_id(String basic_information_id) {
        this.basic_information_id = basic_information_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getHealth_centre() {
        return facility;
    }

    public void setHealth_centre(String health_centre) {
        this.facility = health_centre;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getService_area() {
        return service_area;
    }

    public void setService_area(String service_area) {
        this.service_area = service_area;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getFg_conversion() {
        return fg_conversion;
    }

    public void setFg_conversion(String fg_conversion) {
        this.fg_conversion = fg_conversion;
    }

    public String getDs_conversion() {
        return ds_conversion;
    }

    public void setDs_conversion(String ds_conversion) {
        this.ds_conversion = ds_conversion;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public String getShangring() {
        return shangring;
    }

    public void setShangring(String shangring) {
        this.shangring = shangring;
    }

    public String getTot() {
        return tot;
    }

    public void setTot(String tot) {
        this.tot = tot;
    }

    public String getRefresher() {
        return refresher;
    }

    public void setRefresher(String refresher) {
        this.refresher = refresher;
    }
}
