
package com.SoringBoot.TestProject.controller;
import com.SoringBoot.TestProject.dto.MessageResponse;
import com.SoringBoot.TestProject.entity.Doctor;
import com.SoringBoot.TestProject.service.DoctorService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/v1/api/doctor")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class DoctorController {

    @Autowired
    public DoctorService doctorService;


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Doctor doctor){
        return ResponseEntity.ok(doctorService.save(doctor));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(doctorService.getAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(doctorService.getById(id));

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        doctorService.delete(id);
        return ResponseEntity.ok(new MessageResponse("Success!!"));
    }



    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody Doctor doctor) {
        return ResponseEntity.ok(doctorService.update(id, doctor));
    }


    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "abc", required = false) String value) {

        if(value==null){
            return ResponseEntity.ok(doctorService.getAll());
        }
        return ResponseEntity.ok(doctorService.search(value));
    }

    @GetMapping(value = "/details", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> downloadInvoice() throws JRException, IOException {

        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(doctorService.getAll(), false);

        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("total", "7000");

        JasperReport compileReport = JasperCompileManager
                .compileReport(new FileInputStream("src/main/resources/invoice.jrxml"));

        JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, parameters, beanCollectionDataSource);

        // JasperExportManager.exportReportToPdfFile(jasperPrint,
        // System.currentTimeMillis() + ".pdf");

        byte data[] = JasperExportManager.exportReportToPdf(jasperPrint);

        System.err.println(data);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
    }
}













