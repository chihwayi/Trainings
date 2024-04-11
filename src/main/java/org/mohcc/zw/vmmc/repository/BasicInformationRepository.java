package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.BasicInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasicInformationRepository extends JpaRepository<BasicInformation, String> {

    @Query("SELECT b, t, r, a FROM BasicInformation b " +
            "JOIN b.areasOfServiceProvision a " +
            "JOIN b.remarksComments r " +
            "JOIN b.training t")
    List<BasicInformation> findAllData();
}
