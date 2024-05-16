
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.PatientDiagnosisHistory;
import com.SoringBoot.TestProject.repository.PatientDiagnosisHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientDiagnosisHistoryService {

        @Autowired
    public PatientDiagnosisHistoryRepo patientDiagnosisHistoryRepository;

        public PatientDiagnosisHistory save(PatientDiagnosisHistory patientDiagnosisHistory){
        return patientDiagnosisHistoryRepository.save(patientDiagnosisHistory);
    }
        public List<PatientDiagnosisHistory> getAll(){
        return patientDiagnosisHistoryRepository.findAll();
    }
        public PatientDiagnosisHistory getById(Long id){
        return  patientDiagnosisHistoryRepository.findById(id).get();
    }


        public PatientDiagnosisHistory update(Long id, PatientDiagnosisHistory patientDiagnosisHistory){
        patientDiagnosisHistory.setId(id);
        return patientDiagnosisHistoryRepository.save(patientDiagnosisHistory);
    }


    public void delete(Long id){
       patientDiagnosisHistoryRepository.deleteById(id);
        }


        public List<PatientDiagnosisHistory> search(String value) {
       return   patientDiagnosisHistoryRepository.search(value);
    }
}









