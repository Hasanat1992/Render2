//package com.crud.spring.springCRUD.service;
//
//import com.crud.spring.springCRUD.dto.ProductDTO;
//import com.crud.spring.springCRUD.entity.Product;
//import com.crud.spring.springCRUD.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.Patient;
import com.SoringBoot.TestProject.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    public PatientRepo patientRepository;

        public Patient save(Patient patient){
        return patientRepository.save(patient);
    }

        public List<Patient> getAll(){
        return patientRepository.findAll();
    }

        public Patient getById(Long id){
        return  patientRepository.findById(id).get();
    }

        public Patient update(Long id, Patient patient){
        patient.setId(id);
        return patientRepository.save(patient);
    }

    public void delete(Long id){
        patientRepository.deleteById(id);
    }

        public List<Patient> search(String value) {
       return patientRepository.search(value);
    }


}








