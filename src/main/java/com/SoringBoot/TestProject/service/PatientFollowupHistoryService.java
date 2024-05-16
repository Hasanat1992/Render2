
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.PatientFollowupHistory;
import com.SoringBoot.TestProject.repository.PatientFollowupHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientFollowupHistoryService {
    @Autowired
    public PatientFollowupHistoryRepo patientFollowupHistoryRepository;


        public PatientFollowupHistory save(PatientFollowupHistory  patientFollowupHistory){
        return  patientFollowupHistoryRepository.save( patientFollowupHistory);
    }

        public List< PatientFollowupHistory> getAll(){
        return  patientFollowupHistoryRepository.findAll();
    }

        public PatientFollowupHistory getById(Long id){
        return  patientFollowupHistoryRepository.findById(id).get();
    }

        public  PatientFollowupHistory update(Long id, PatientFollowupHistory   patientFollowupHistory){
         patientFollowupHistory.setId(id);
        return  patientFollowupHistoryRepository.save( patientFollowupHistory);
    }


    public void delete(Long id){
        patientFollowupHistoryRepository.deleteById(id);
    }

        public List<PatientFollowupHistory> search(String value) {
       return patientFollowupHistoryRepository.search(value);
    }

}









