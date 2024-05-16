
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.PatientBill;
import com.SoringBoot.TestProject.repository.PatientBillRepo;
import com.SoringBoot.TestProject.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientBillService {
    @Autowired
    public PatientBillRepo patientBillRepository;

    public PatientBill save(PatientBill patientBill) {
        return patientBillRepository.save(patientBill);
    }


        public List<PatientBill> getAll(){
        return patientBillRepository.findAll();
    }


        public PatientBill getById(Long id){
        return  patientBillRepository.findById(id).get();
    }
        public PatientBill update(Long id, PatientBill patientBill){
        patientBill.setId(id);
        return patientBillRepository.save(patientBill);
    }

    public void delete(Long id){
        patientBillRepository.deleteById(id);
    }

            public List<PatientBill> search(String value) {
       return patientBillRepository.search(value);
    }


}











