package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.TrainingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingTypeRepository extends JpaRepository<TrainingType,String>{

}
