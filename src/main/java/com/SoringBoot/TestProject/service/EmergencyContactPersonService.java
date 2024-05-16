
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.EmergencyContactPerson;
import com.SoringBoot.TestProject.repository.EmergencyContactPersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyContactPersonService {
        @Autowired
    public EmergencyContactPersonRepo emergencyContactPersonRepository;

        public EmergencyContactPerson save(EmergencyContactPerson emergencyContactPerson){
        return emergencyContactPersonRepository.save(emergencyContactPerson);
    }
        public List<EmergencyContactPerson> getAll(){
        return emergencyContactPersonRepository.findAll();
    }

        public EmergencyContactPerson getById(Long id){
        return  emergencyContactPersonRepository.findById(id).get();
    }

        public EmergencyContactPerson update(Long id, EmergencyContactPerson emergencyContactPerson){
        emergencyContactPerson.setId(id);
        return emergencyContactPersonRepository.save(emergencyContactPerson);
    }

    public void delete(Long id){
       emergencyContactPersonRepository.deleteById(id);
    }
        public List<EmergencyContactPerson> search(String value) {
       return emergencyContactPersonRepository.search(value);
    }
}









