
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient, Long> {

        @Query(value = " select * from patients where name like %:val% or type like %:val% ", nativeQuery = true)
        List<Patient> search(@Param("val") String value);

}





