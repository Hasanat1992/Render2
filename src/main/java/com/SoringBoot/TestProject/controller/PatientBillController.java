

package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.PatientBill;
import com.SoringBoot.TestProject.service.PatientBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/patientBill")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientBillController {

    @Autowired
    public PatientBillService patientBillService;


    @PostMapping
    public ResponseEntity<?> save(@RequestBody PatientBill patientBill) {
        return ResponseEntity.ok(patientBillService.save(patientBill));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(patientBillService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientBillService.getById(id));
    }

        @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        patientBillService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

        @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody PatientBill patientBill) {
        return ResponseEntity.ok(patientBillService.update(id, patientBill));
    }

        @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(patientBillService.getAll());
        }
        return ResponseEntity.ok(patientBillService.search(value));
    }
}











