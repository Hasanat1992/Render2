package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.Doctor;
import com.SoringBoot.TestProject.entity.Nurse;
import com.SoringBoot.TestProject.repository.DoctorRepo;
import com.SoringBoot.TestProject.repository.NurseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseService {
    @Autowired
    public NurseRepo nurseRepo;

    public Nurse save(Nurse nurse) {

        return nurseRepo.save(nurse);
    }
    public List<Nurse> getAll() {

        return nurseRepo.findAll();
    }
    public Nurse getById(Long id) {

        return nurseRepo.findById(id).get();
    }
    public Nurse update(Long id, Nurse nurse){
        nurse.setId(id);
        return nurseRepo.save(nurse);
    }

    public void delete(Long id) {
        nurseRepo.deleteById(id);
    }
}
