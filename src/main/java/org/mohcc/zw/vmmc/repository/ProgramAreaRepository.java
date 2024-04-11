package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.ProgramArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramAreaRepository extends JpaRepository<ProgramArea,String>{

}
