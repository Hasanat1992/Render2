package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DoctorRepo extends JpaRepository<Doctor, Long> {
    @Query(value = " select * from doctors where name like %:val% or type like %:val% ", nativeQuery = true)
    List<Doctor> search(@Param("val") String value);
}

