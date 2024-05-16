
package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.HospitalDiagnosisList;
import com.SoringBoot.TestProject.repository.HospitalDiagnosisListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalDiagnosisListService {
    @Autowired
    public HospitalDiagnosisListRepo hospitalDiagnosisListRepository;


        public HospitalDiagnosisList save(HospitalDiagnosisList hospitalDiagnosisList){
        return hospitalDiagnosisListRepository.save(hospitalDiagnosisList);
    }

        public List<HospitalDiagnosisList> getAll(){
        return hospitalDiagnosisListRepository.findAll();
    }


        public HospitalDiagnosisList getById(Long id){
        return hospitalDiagnosisListRepository.findById(id).get();
    }

        public HospitalDiagnosisList update(Long id, HospitalDiagnosisList hospitalDiagnosisList){
        hospitalDiagnosisList.setId(id);
        return hospitalDiagnosisListRepository.save(hospitalDiagnosisList);
    }


    public void delete(Long id){
        hospitalDiagnosisListRepository.deleteById(id);
    }

        public List<HospitalDiagnosisList> search(String value) {
       return hospitalDiagnosisListRepository.search(value);
    }


}







