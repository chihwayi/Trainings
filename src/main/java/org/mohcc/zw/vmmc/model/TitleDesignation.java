package org.mohcc.zw.vmmc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TitleDesignation {
	@Id
	private int title_id;
	private int designation_id;
	private String title;
	private String designation;
	
	public TitleDesignation(int title_id, int designation_id, String title, String designation) {
		this.title_id = title_id;
		this.designation_id = designation_id;
		this.title = title;
		this.designation = designation;
	}
	public TitleDesignation() {
	}
	
	

}
