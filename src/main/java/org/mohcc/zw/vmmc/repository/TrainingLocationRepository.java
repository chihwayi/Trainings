package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.TrainingLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingLocationRepository extends JpaRepository<TrainingLocation,String>{

}
