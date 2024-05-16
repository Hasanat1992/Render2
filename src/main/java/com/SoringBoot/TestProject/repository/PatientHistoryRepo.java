
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.PatientHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientHistoryRepo extends JpaRepository<PatientHistory, Long> {

        @Query(value = " select * from patientHistory where name like %:val% or type like %:val% ", nativeQuery = true)
        List<PatientHistory> search(@Param("val") String value);

}








