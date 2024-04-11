package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District,String> {
}
