
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.PatientHealthInsurance;
import com.SoringBoot.TestProject.repository.PatientHealthInsuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientHealthInsuranceService {

    @Autowired
    public PatientHealthInsuranceRepo patientHealthInsuranceRepository;


        public PatientHealthInsurance save(PatientHealthInsurance patientHealthInsurance){
        return patientHealthInsuranceRepository.save( patientHealthInsurance);
    }

        public List<PatientHealthInsurance> getAll(){
        return patientHealthInsuranceRepository.findAll();
    }

        public PatientHealthInsurance getById(Long id){
        return  patientHealthInsuranceRepository.findById(id).get();
    }
        public PatientHealthInsurance update(Long id, PatientHealthInsurance patientHealthInsurance){
        patientHealthInsurance.setId(id);
        return patientHealthInsuranceRepository.save(patientHealthInsurance);
    }

    public void delete(Long id){
       patientHealthInsuranceRepository.deleteById(id);
    }

        public List<PatientHealthInsurance> search(String value) {
       return patientHealthInsuranceRepository.search(value);
    }

}










