
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.PatientBillPaymentHistory;
import com.SoringBoot.TestProject.service.PatientBillPaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/patientBillPaymentHistory")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientBillPaymentHistoryController {

    @Autowired
    public PatientBillPaymentHistoryService patientBillPaymentHistoryService;


    @PostMapping
    public ResponseEntity<?> save(@RequestBody PatientBillPaymentHistory patientBillPaymentHistory) {
        return ResponseEntity.ok(patientBillPaymentHistoryService.save(patientBillPaymentHistory));
    }
    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(patientBillPaymentHistoryService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientBillPaymentHistoryService.getById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        patientBillPaymentHistoryService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody PatientBillPaymentHistory patientBillPaymentHistory) {
        return ResponseEntity.ok(patientBillPaymentHistoryService.update(id, patientBillPaymentHistory));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(patientBillPaymentHistoryService.getAll());
        }
        return ResponseEntity.ok(patientBillPaymentHistoryService.search(value));
    }
}








