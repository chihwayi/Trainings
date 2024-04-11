package org.mohcc.zw.vmmc.controller;

import org.mohcc.zw.vmmc.model.ProgramArea;
import org.mohcc.zw.vmmc.service.ProgramAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/program-area")
public class ProgramAreaController {

	private final ProgramAreaService programAreaService;

	@Autowired
	public ProgramAreaController(ProgramAreaService programAreaService) {
		super();
		this.programAreaService = programAreaService;
	}
	
	@GetMapping("/get-all")
    public ResponseEntity<List<ProgramArea>> getAllProgramArea() {
        List<ProgramArea> programAreaInfoList = programAreaService.getAllProgramArea();
        return ResponseEntity.ok(programAreaInfoList);
    }
	
	@PostMapping("/save")
    public ResponseEntity<ProgramArea> saveProgramArea(@RequestBody ProgramArea programArea) {
		ProgramArea programAreaInfo = programAreaService.saveProgramArea(programArea);
        return ResponseEntity.ok(programAreaInfo);
    }

}
