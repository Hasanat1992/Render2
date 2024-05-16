package com.SoringBoot.TestProject.service;


import com.SoringBoot.TestProject.entity.Doctor;
import com.SoringBoot.TestProject.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {



    @Autowired
    public DoctorRepo doctorRepo;


    public Doctor save(Doctor doctor) {

        return doctorRepo.save(doctor);
    }


    public List<Doctor> getAll() {

        return doctorRepo.findAll();
    }



    public Doctor getById(Long id) {

        return doctorRepo.findById(id).get();
    }


    public Doctor update(Long id, Doctor doctor){
       doctor.setId(id);
       return doctorRepo.save(doctor);
    }

    //    public void delete(Long id){
//        productRepository.deleteById(id);
//    }

    public void delete(Long id) {
        doctorRepo.deleteById(id);
    }



    public List<Doctor> search(String value){
               return doctorRepo.search(value);
    }



}






