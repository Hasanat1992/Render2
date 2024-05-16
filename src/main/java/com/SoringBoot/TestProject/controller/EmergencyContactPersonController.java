
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.EmergencyContactPerson;
import com.SoringBoot.TestProject.service.EmergencyContactPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/emergencyContactPerson")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class EmergencyContactPersonController {
        @Autowired
    public EmergencyContactPersonService emergencyContactPersonService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody EmergencyContactPerson emergencyContactPerson) {
        return ResponseEntity.ok( emergencyContactPersonService.save( emergencyContactPerson));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(emergencyContactPersonService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(emergencyContactPersonService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        emergencyContactPersonService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody EmergencyContactPerson emergencyContactPerson) {
        return ResponseEntity.ok(emergencyContactPersonService.update(id, emergencyContactPerson));
    }


    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(emergencyContactPersonService.getAll());
        }
        return ResponseEntity.ok(emergencyContactPersonService.search(value));
    }

}









