package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends JpaRepository<Facility,String> {
}
