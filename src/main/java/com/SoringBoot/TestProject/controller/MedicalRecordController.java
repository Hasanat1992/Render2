
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.MedicalRecord;
import com.SoringBoot.TestProject.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/medicalRecord")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class MedicalRecordController {

    @Autowired
    public MedicalRecordService medicalRecordService;
        @PostMapping
    public ResponseEntity<?> save(@RequestBody MedicalRecord medicalRecord) {
            return ResponseEntity.ok(medicalRecordService.save(medicalRecord));
        }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok( medicalRecordService.getAll());
    }



    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(medicalRecordService.getById(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        medicalRecordService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody MedicalRecord medicalRecord) {
        return ResponseEntity.ok(medicalRecordService.update(id, medicalRecord));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(medicalRecordService.getAll());
        }
        return ResponseEntity.ok(medicalRecordService.search(value));
    }
}














