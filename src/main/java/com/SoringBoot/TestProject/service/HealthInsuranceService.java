
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.HealthInsurance;
import com.SoringBoot.TestProject.repository.HealthInsuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthInsuranceService {
        @Autowired
    public HealthInsuranceRepo healthInsuranceRepository;

        public HealthInsurance save(HealthInsurance healthInsurance){
        return  healthInsuranceRepository.save( healthInsurance);
    }

        public List<HealthInsurance> getAll(){
        return healthInsuranceRepository.findAll();
    }
        public HealthInsurance getById(Long id){
        return  healthInsuranceRepository.findById(id).get();
    }


        public HealthInsurance update(Long id, HealthInsurance healthInsurance){
        healthInsurance.setId(id);
        return healthInsuranceRepository.save(healthInsurance);
    }

    public void delete(Long id){
        healthInsuranceRepository.deleteById(id);
    }

        public List<HealthInsurance> search(String value) {
       return healthInsuranceRepository.search(value);
    }

}











