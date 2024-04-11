package org.mohcc.zw.vmmc.controller;

import org.mohcc.zw.vmmc.model.BasicInformation;
import org.mohcc.zw.vmmc.service.BasicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/basic-information")
public class BasicInformationController {

    private final BasicInformationService basicInformationService;

    @Autowired
    public BasicInformationController(BasicInformationService basicInformationService) {
        this.basicInformationService = basicInformationService;
    }

    @PostMapping("/save")
    public ResponseEntity<BasicInformation> saveBasicInformation(@RequestBody BasicInformation basicInformation) {
        BasicInformation savedBasicInfo = basicInformationService.saveBasicInformation(basicInformation);
        return ResponseEntity.ok(savedBasicInfo);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<BasicInformation> getBasicInformationById(@PathVariable String id) {
        BasicInformation basicInfo = basicInformationService.getBasicInformationById(id);
        return ResponseEntity.ok(basicInfo);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<BasicInformation>> getAllBasicInformation() {
        List<BasicInformation> basicInfoList = basicInformationService.getAllBasicInformation();
        return ResponseEntity.ok(basicInfoList);
    }

    @GetMapping("/get-all-data")
    public ResponseEntity<List<BasicInformation>> getAllData() {
        List<BasicInformation> allData = basicInformationService.findAllData();
        return ResponseEntity.ok(allData);
    }
    
    @GetMapping("/check/{id}")
    public boolean checkBasicInformationIdExists(@PathVariable String id) {
        return basicInformationService.existsById(id);
    }

}
