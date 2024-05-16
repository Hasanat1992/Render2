
//import org.springframework.beans.factory.annotation.Value;

package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.HospitalDepartment;
import com.SoringBoot.TestProject.service.HospitalDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/hospitalDepartment")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class HospitalDepartmentController {
        @Autowired
    public HospitalDepartmentService hospitalDepartmentService;


    @PostMapping
    public ResponseEntity<?> save(@RequestBody HospitalDepartment hospitalDepartment) {
        return ResponseEntity.ok(hospitalDepartmentService.save(hospitalDepartment));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(hospitalDepartmentService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(hospitalDepartmentService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        hospitalDepartmentService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody HospitalDepartment hospitalDepartment) {
        return ResponseEntity.ok(hospitalDepartmentService.update(id, hospitalDepartment));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(hospitalDepartmentService.getAll());
        }
        return ResponseEntity.ok(hospitalDepartmentService.search(value));
    }

}





