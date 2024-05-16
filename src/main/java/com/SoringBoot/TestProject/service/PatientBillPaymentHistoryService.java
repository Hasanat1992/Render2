
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.PatientBillPaymentHistory;
import com.SoringBoot.TestProject.repository.PatientBillPaymentHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientBillPaymentHistoryService {
        @Autowired
    public PatientBillPaymentHistoryRepo patientBillPaymentHistoryRepository;

        public PatientBillPaymentHistory save(PatientBillPaymentHistory patientBillPaymentHistory){
        return patientBillPaymentHistoryRepository.save(patientBillPaymentHistory);
    }

        public List<PatientBillPaymentHistory> getAll(){
        return patientBillPaymentHistoryRepository.findAll();
    }
        public PatientBillPaymentHistory getById(Long id){
        return  patientBillPaymentHistoryRepository.findById(id).get();
    }
        public PatientBillPaymentHistory update(Long id, PatientBillPaymentHistory patientBillPaymentHistory){
        patientBillPaymentHistory.setId(id);
        return patientBillPaymentHistoryRepository.save(patientBillPaymentHistory);
    }

    public void delete(Long id){
        patientBillPaymentHistoryRepository.deleteById(id);
    }

        public List<PatientBillPaymentHistory> search(String value) {
       return patientBillPaymentHistoryRepository.search(value);
    }
}







