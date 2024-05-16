
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.PatientHistory;
import com.SoringBoot.TestProject.service.PatientHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/patientHistory")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientHistoryController {

    @Autowired
    public PatientHistoryService patientHistoryService;


    @PostMapping
    public ResponseEntity<?> save(@RequestBody PatientHistory patientHistory) {
        return ResponseEntity.ok(patientHistoryService.save(patientHistory));
    }


    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(patientHistoryService.getAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientHistoryService.getById(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        patientHistoryService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody PatientHistory patientHistory) {
        return ResponseEntity.ok(patientHistoryService.update(id, patientHistory));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(patientHistoryService.getAll());
        }
        return ResponseEntity.ok(patientHistoryService.search(value));
    }
}









