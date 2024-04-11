package org.mohcc.zw.vmmc.controller;

import org.mohcc.zw.vmmc.model.ConsolidatedInformation;
import org.mohcc.zw.vmmc.service.ConsolidatedInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/all-joined-data")
public class ConsolidatedInformationController {

    private final ConsolidatedInformationService consolidatedInformationService;

    @Autowired
    public ConsolidatedInformationController(ConsolidatedInformationService consolidatedInformationService) {
        this.consolidatedInformationService = consolidatedInformationService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<ConsolidatedInformation>> getAllConsolidatedInformation() {
        List<ConsolidatedInformation> consolidatedList = consolidatedInformationService.getAllConsolidatedInformation();
        return ResponseEntity.ok(consolidatedList);
    }
}
