package org.mohcc.zw.vmmc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Title {
	@Id
	private int title_id;
	private String title;

}
