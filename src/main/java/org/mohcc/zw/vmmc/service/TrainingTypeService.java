package org.mohcc.zw.vmmc.service;

import java.util.List;

import org.mohcc.zw.vmmc.model.TrainingType;

public interface TrainingTypeService {
	
	TrainingType saveTrainingType(TrainingType trainingType);
	TrainingType getTrainingTypeById(String id);
	List<TrainingType> getAllTrainingType();

}
