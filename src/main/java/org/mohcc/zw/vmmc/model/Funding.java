package org.mohcc.zw.vmmc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Funding {
	
	@Id
	private String funderId;
	private String funderName;

}
