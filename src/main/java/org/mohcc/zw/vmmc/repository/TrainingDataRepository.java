package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.TrainingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingDataRepository extends JpaRepository<TrainingData,String>{

}
