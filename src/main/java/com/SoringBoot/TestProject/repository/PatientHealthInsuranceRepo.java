
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.PatientHealthInsurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientHealthInsuranceRepo extends JpaRepository<PatientHealthInsurance, Long> {

        @Query(value = " select * from patientHealthInsurance where name like %:val% or type like %:val% ", nativeQuery = true)
        List<PatientHealthInsurance> search(@Param("val") String value);

}






