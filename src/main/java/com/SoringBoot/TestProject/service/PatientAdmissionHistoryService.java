
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.PatientAdmissionHistory;
import com.SoringBoot.TestProject.repository.PatientAdmissionHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientAdmissionHistoryService {
        @Autowired
    public PatientAdmissionHistoryRepo patientAdmissionHistoryRepository;

        public PatientAdmissionHistory save(PatientAdmissionHistory patientAdmissionHistory){
        return patientAdmissionHistoryRepository.save(patientAdmissionHistory);
    }
        public List<PatientAdmissionHistory> getAll(){
        return patientAdmissionHistoryRepository.findAll();
    }


        public PatientAdmissionHistory getById(Long id){
        return  patientAdmissionHistoryRepository.findById(id).get();
    }
        public  PatientAdmissionHistory update(Long id,  PatientAdmissionHistory  patientAdmissionHistory){
         patientAdmissionHistory.setId(id);
        return  patientAdmissionHistoryRepository.save( patientAdmissionHistory);
    }

        public void delete(Long id){
        patientAdmissionHistoryRepository.deleteById(id);
    }

        public List<PatientAdmissionHistory> search(String value) {
       return patientAdmissionHistoryRepository.search(value);
    }



}










