package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.Doctor;
import com.SoringBoot.TestProject.entity.Nurse;
import com.SoringBoot.TestProject.service.DoctorService;
import com.SoringBoot.TestProject.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/nurse")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class NurseController {

    @Autowired
    public NurseService nurseService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Nurse nurse){
        return ResponseEntity.ok(nurseService.save(nurse));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(nurseService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(nurseService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        nurseService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Nurse nurse) {
        return ResponseEntity.ok(nurseService.update(id, nurse));
    }
}
