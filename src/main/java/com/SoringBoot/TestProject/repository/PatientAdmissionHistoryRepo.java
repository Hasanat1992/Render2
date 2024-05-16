

package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.PatientAdmissionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientAdmissionHistoryRepo extends JpaRepository<PatientAdmissionHistory, Long> {

        @Query(value = " select * from patientAdmissionHistory where name like %:val% or type like %:val% ", nativeQuery = true)
        List<PatientAdmissionHistory> search(@Param("val") String value);
}




