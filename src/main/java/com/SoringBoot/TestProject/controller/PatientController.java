//package com.crud.spring.springCRUD.controller;
//
//import com.crud.spring.springCRUD.entity.Product;
//import com.crud.spring.springCRUD.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.Patient;
import com.SoringBoot.TestProject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/patient")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientController {

    @Autowired
    public PatientService patientService;


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.save(patient));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(patientService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        patientService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.update(id, patient));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(patientService.getAll());
        }
        return ResponseEntity.ok(patientService.search(value));
    }



}










