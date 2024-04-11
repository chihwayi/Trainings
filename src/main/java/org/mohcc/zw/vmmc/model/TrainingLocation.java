package org.mohcc.zw.vmmc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TrainingLocation {
	@Id
	private String locationId;
	private String provinceId;
	private String districtId;
	private String locationName;

}
