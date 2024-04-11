package org.mohcc.zw.vmmc.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TrainingData {
	@Id
	private String trainingId;
	private String basic_information_id;
	private String programId;
	private String facilitatorId;
	private String funderId;
	private String programAreaTrainingId;
	private int numberOfDays;
	private LocalDate startDate;
	private LocalDate endDate;
	private String typeId;
	private String organizationId;
	private String methodId;
	private String comments;
	private String remarks;

}
