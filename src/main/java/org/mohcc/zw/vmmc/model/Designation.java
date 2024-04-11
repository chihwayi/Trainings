package org.mohcc.zw.vmmc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Designation {
	@Id
	int designation_id;
	
	@Column(name = "title_id", nullable = false, unique = false)
	int title_id;
	String designation;

}
