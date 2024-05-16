
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.PatientHealthInsurance;
import com.SoringBoot.TestProject.service.PatientHealthInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/patientHealthInsurance")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientHealthInsuranceController {
        @Autowired
    public PatientHealthInsuranceService patientHealthInsuranceService;



    @PostMapping
    public ResponseEntity<?> save(@RequestBody PatientHealthInsurance patientHealthInsurance) {
        return ResponseEntity.ok(patientHealthInsuranceService.save(patientHealthInsurance));
    }
    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(patientHealthInsuranceService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientHealthInsuranceService.getById(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        patientHealthInsuranceService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody  PatientHealthInsurance  patientHealthInsurance) {
        return ResponseEntity.ok( patientHealthInsuranceService.update(id,  patientHealthInsurance));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(patientHealthInsuranceService.getAll());
        }
        return ResponseEntity.ok(patientHealthInsuranceService.search(value));
    }
}











