
package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.HospitalDiagnosisList;
import com.SoringBoot.TestProject.service.HospitalDiagnosisListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/hospitalDiagnosisList")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class HospitalDiagnosisListController {

    @Autowired
    public HospitalDiagnosisListService hospitalDiagnosisListService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody HospitalDiagnosisList hospitalDiagnosisList) {
        return ResponseEntity.ok(hospitalDiagnosisListService.save(hospitalDiagnosisList));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(hospitalDiagnosisListService.getAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(hospitalDiagnosisListService.getById(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
       hospitalDiagnosisListService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody  HospitalDiagnosisList  hospitalDiagnosisList) {
        return ResponseEntity.ok( hospitalDiagnosisListService.update(id,  hospitalDiagnosisList));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(hospitalDiagnosisListService.getAll());
        }
        return ResponseEntity.ok(hospitalDiagnosisListService.search(value));
    }

}










