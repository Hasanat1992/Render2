
//import com.crud.spring.springCRUD.dto.ProductDTO;

package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.HospitalDepartment;
import com.SoringBoot.TestProject.repository.HospitalDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalDepartmentService {
    @Autowired
    public HospitalDepartmentRepo hospitalDepartmentRepository;

    public HospitalDepartment save(HospitalDepartment hospitalDepartment){
        return hospitalDepartmentRepository.save(hospitalDepartment);
    }
    public List<HospitalDepartment> getAll(){
        return hospitalDepartmentRepository.findAll();
    }
    public HospitalDepartment getById(Long id){
        return  hospitalDepartmentRepository.findById(id).get();
    }
    public HospitalDepartment update(Long id, HospitalDepartment hospitalDepartment){
        hospitalDepartment.setId(id);
        return hospitalDepartmentRepository.save(hospitalDepartment);
    }
    public void delete(Long id){
        hospitalDepartmentRepository.deleteById(id);
    }

    public List<HospitalDepartment> search(String value) {
       return hospitalDepartmentRepository.search(value);
    }

}





