
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.PatientFollowupHistory;
import com.SoringBoot.TestProject.service.PatientFollowupHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/ patientFollowupHistory")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientFollowupHistoryController {


    @Autowired
    public PatientFollowupHistoryService patientFollowupHistoryService;

        @PostMapping
    public ResponseEntity<?> save(@RequestBody PatientFollowupHistory patientFollowupHistory) {
        return ResponseEntity.ok(patientFollowupHistoryService.save(patientFollowupHistory));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(patientFollowupHistoryService.getAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientFollowupHistoryService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        patientFollowupHistoryService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

        @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody  PatientFollowupHistory patientFollowupHistory) {
        return ResponseEntity.ok( patientFollowupHistoryService.update(id,  patientFollowupHistory));
    }

        @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(patientFollowupHistoryService.getAll());
        }
        return ResponseEntity.ok(patientFollowupHistoryService.search(value));
    }

}










