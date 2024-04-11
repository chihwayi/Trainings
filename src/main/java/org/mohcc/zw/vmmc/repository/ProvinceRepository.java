package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,String> {
}
