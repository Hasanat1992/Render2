
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.HealthInsurance;
import com.SoringBoot.TestProject.service.HealthInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/healthInsurance")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class HealthInsuranceController {
        @Autowired
    public HealthInsuranceService healthInsuranceService;



    @PostMapping
    public ResponseEntity<?> save(@RequestBody HealthInsurance healthInsurance) {
        return ResponseEntity.ok(healthInsuranceService.save(healthInsurance));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(healthInsuranceService.getAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(healthInsuranceService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        healthInsuranceService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody HealthInsurance healthInsurance) {
        return ResponseEntity.ok(healthInsuranceService.update(id, healthInsurance));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(healthInsuranceService.getAll());
        }
        return ResponseEntity.ok(healthInsuranceService.search(value));
    }
}










