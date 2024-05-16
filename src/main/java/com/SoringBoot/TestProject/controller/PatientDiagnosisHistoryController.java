

package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.PatientDiagnosisHistory;
import com.SoringBoot.TestProject.service.PatientDiagnosisHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/patientDiagnosisHistory")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientDiagnosisHistoryController {


    @Autowired
    public PatientDiagnosisHistoryService patientDiagnosisHistoryService;


    @PostMapping
    public ResponseEntity<?> save(@RequestBody PatientDiagnosisHistory patientDiagnosisHistory) {
        return ResponseEntity.ok(patientDiagnosisHistoryService.save(patientDiagnosisHistory));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(patientDiagnosisHistoryService.getAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientDiagnosisHistoryService.getById(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        patientDiagnosisHistoryService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody PatientDiagnosisHistory patientDiagnosisHistory) {
        return ResponseEntity.ok(patientDiagnosisHistoryService.update(id, patientDiagnosisHistory));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if (value == null) {
            return ResponseEntity.ok(patientDiagnosisHistoryService.getAll());
        }
        return ResponseEntity.ok(patientDiagnosisHistoryService.search(value));
    }
}






