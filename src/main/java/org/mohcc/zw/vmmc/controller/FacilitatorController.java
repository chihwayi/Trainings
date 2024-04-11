package org.mohcc.zw.vmmc.controller;

import org.mohcc.zw.vmmc.model.Facilitator;
import org.mohcc.zw.vmmc.service.FacilitatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facilitator")
public class FacilitatorController {

	private final FacilitatorService facilitatorService;

    @Autowired
	public FacilitatorController(FacilitatorService facilitatorService) {
		super();
		this.facilitatorService = facilitatorService;
	}

	@GetMapping("/get-all")
    public ResponseEntity<List<Facilitator>> getAllFacilitator() {
        List<Facilitator> facilitatorInfoList = facilitatorService.getAllFacilitator();
        return ResponseEntity.ok(facilitatorInfoList);
    }
	
	@PostMapping("/save")
    public ResponseEntity<Facilitator> saveFacilitator(@RequestBody Facilitator trainingType) {
		Facilitator facilitatorInfo = facilitatorService.saveFacilitator(trainingType);
        return ResponseEntity.ok(facilitatorInfo);
    }
	
	@GetMapping("/get/{id}")
    public ResponseEntity<Facilitator> getFacilitatorById(@PathVariable String id) {
		Facilitator facilitatorInfo = facilitatorService.getFacilitatorById(id);
        return ResponseEntity.ok(facilitatorInfo);
    }
	
	@GetMapping("/check/{id}")
    public boolean checkFacilitatorInformationIdExists(@PathVariable String id) {
        return facilitatorService.existsById(id);
    }

}
