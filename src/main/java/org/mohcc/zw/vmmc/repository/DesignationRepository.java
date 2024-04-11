package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository  extends JpaRepository<Designation,Integer>{

}
