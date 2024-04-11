package org.mohcc.zw.vmmc.service;

import java.util.List;

import org.mohcc.zw.vmmc.model.Funding;

public interface FundingService {
	Funding saveFunding(Funding funding);
	Funding getFundingId(String id);
	List<Funding> getAllFunding();

}
