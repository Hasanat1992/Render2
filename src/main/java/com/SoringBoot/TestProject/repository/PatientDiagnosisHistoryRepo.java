
package com.SoringBoot.TestProject.repository;


import com.SoringBoot.TestProject.entity.PatientDiagnosisHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDiagnosisHistoryRepo extends JpaRepository<PatientDiagnosisHistory, Long> {

        @Query(value = " select * from patientDiagnosisHistory where name like %:val% or type like %:val% ", nativeQuery = true)
        List<PatientDiagnosisHistory> search(@Param("val") String value);

}





