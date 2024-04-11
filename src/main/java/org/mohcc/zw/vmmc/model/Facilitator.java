package org.mohcc.zw.vmmc.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Facilitator {
	
	@Id
	private String facilitator_id;
	private String basic_information_id;
	private String trainer_type_id;
	private String trainer_affiliation;
	private String program_area_id;
	private LocalDate date_trained;

}
