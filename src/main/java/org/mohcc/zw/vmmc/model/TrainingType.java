package org.mohcc.zw.vmmc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TrainingType {
	
	@Id
	private String typeId;	
	private String typeName;

}
