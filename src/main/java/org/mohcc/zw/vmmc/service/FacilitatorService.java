package org.mohcc.zw.vmmc.service;

import java.util.List;

import org.mohcc.zw.vmmc.model.Facilitator;

public interface FacilitatorService {
	
	Facilitator saveFacilitator(Facilitator facilitator);
	Facilitator getFacilitatorById(String id);
	List<Facilitator> getAllFacilitator();
	boolean existsById(String id);

}
