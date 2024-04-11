package org.mohcc.zw.vmmc.repository;
import org.mohcc.zw.vmmc.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends JpaRepository<Training,String> {
    //Training findTrainingByBasic_information_id(String id);
}
