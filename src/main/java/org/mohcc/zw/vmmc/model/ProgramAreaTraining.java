package org.mohcc.zw.vmmc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProgramAreaTraining {
	
	@Id
	private String programAreaTrainingId;
	private String programId;
	private String programAreaTrainingName;

}
