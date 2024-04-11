package org.mohcc.zw.vmmc.controller;
import org.mohcc.zw.vmmc.model.Funding;
import org.mohcc.zw.vmmc.service.FundingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funding")
public class FundingController {

	private final FundingService fundingService;

	@Autowired
	public FundingController(FundingService fundingService) {
		super();
		this.fundingService = fundingService;
	}

	@GetMapping("/get-all")
    public ResponseEntity<List<Funding>> getAllFunding() {
        List<Funding> fundingInfoList = fundingService.getAllFunding();
        return ResponseEntity.ok(fundingInfoList);
    }
	
	@PostMapping("/save")
    public ResponseEntity<Funding> saveTrainingType(@RequestBody Funding funding) {
		Funding fundingInfo = fundingService.saveFunding(funding);
        return ResponseEntity.ok(fundingInfo);
    }

}
