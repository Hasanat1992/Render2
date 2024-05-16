
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.PatientAdmissionHistory;
import com.SoringBoot.TestProject.service.PatientAdmissionHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/patientAdmissionHistory")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientAdmissionHistoryController {


    @Autowired
    public PatientAdmissionHistoryService patientAdmissionHistoryService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody PatientAdmissionHistory patientAdmissionHistory) {
        return ResponseEntity.ok(patientAdmissionHistoryService.save(patientAdmissionHistory));
    }


    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(patientAdmissionHistoryService.getAll());

    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientAdmissionHistoryService.getById(id));
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        patientAdmissionHistoryService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody PatientAdmissionHistory patientAdmissionHistory) {
        return ResponseEntity.ok(patientAdmissionHistoryService.update(id, patientAdmissionHistory));
    }


    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(patientAdmissionHistoryService.getAll());
        }
        return ResponseEntity.ok(patientAdmissionHistoryService.search(value));
    }



}











