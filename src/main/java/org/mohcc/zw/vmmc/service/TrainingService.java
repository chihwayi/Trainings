package org.mohcc.zw.vmmc.service;

import org.mohcc.zw.vmmc.model.Training;

import java.util.List;

public interface TrainingService {
    Training saveTraining(Training training);
    Training getTrainingById(String id);
    //Training getTrainingByBasicInformationId(String id);
    List<Training> getAllTrainings();
}
