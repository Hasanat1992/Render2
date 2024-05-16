
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.MedicalRecord;
import com.SoringBoot.TestProject.repository.MedicalRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService {
        @Autowired
    public MedicalRecordRepo medicalRecordRepository;

            public MedicalRecord save(MedicalRecord medicalRecord){
        return medicalRecordRepository.save(medicalRecord);
    }


        public List<MedicalRecord> getAll(){
        return medicalRecordRepository.findAll();
    }

        public MedicalRecord getById(Long id){
        return  medicalRecordRepository.findById(id).get();
    }

        public MedicalRecord update(Long id,MedicalRecord medicalRecord){
       medicalRecord.setId(id);
        return medicalRecordRepository.save(medicalRecord);
    }


    public void delete(Long id){
         medicalRecordRepository.deleteById(id);
    }


        public List<MedicalRecord> search(String value) {
       return medicalRecordRepository.search(value);
    }
}
















//
//
//}
//
//
//
//
//
//
//
//
