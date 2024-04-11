package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.BasicInformation;
import org.mohcc.zw.vmmc.model.ConsolidatedInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsolidatedInformationRepository extends JpaRepository<BasicInformation, String> {
    @Query("SELECT new org.mohcc.zw.vmmc.model.ConsolidatedInformation(" +
            "b.basic_information_id, b.name, b.surname, b.sex, b.designation, " +
            "b.facility, b.district, b.province, a.service_area, a.trainer, " +
            "r.remarks, r.comments, t.basic, t.fg_conversion, " +
            "t.ds_conversion, t.certification, t.emergency, t.shangring, t.tot, t.refresher) " +
            "FROM BasicInformation b " +
            "LEFT JOIN AreasOfServiceProvision a ON b.basic_information_id = a.basic_information_id " +
            "LEFT JOIN RemarksComments r ON b.basic_information_id = r.basic_information_id " +
            "LEFT JOIN Training t ON b.basic_information_id = t.basic_information_id")
    List<ConsolidatedInformation> findAllJoinedData();
}
