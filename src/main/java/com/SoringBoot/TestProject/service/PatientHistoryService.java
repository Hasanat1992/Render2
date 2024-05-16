
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.PatientHistory;
import com.SoringBoot.TestProject.repository.PatientHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientHistoryService {
    @Autowired
    public PatientHistoryRepo patientHistoryRepository;


    public PatientHistory save(PatientHistory patientHistory) {
        return patientHistoryRepository.save(patientHistory);
    }

    public List<PatientHistory> getAll() {
        return patientHistoryRepository.findAll();
    }


    public PatientHistory getById(Long id) {
        return patientHistoryRepository.findById(id).get();
    }


    public PatientHistory update(Long id, PatientHistory patientHistory) {
        patientHistory.setId(id);
        return patientHistoryRepository.save(patientHistory);
    }

    public void delete(Long id){
        patientHistoryRepository.deleteById(id);
    }

        public List<PatientHistory> search(String value) {
       return patientHistoryRepository.search(value);
    }
}





