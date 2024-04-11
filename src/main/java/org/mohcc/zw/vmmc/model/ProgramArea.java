package org.mohcc.zw.vmmc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProgramArea {
	
	@Id
	private String programId;
	private String programName;

}
