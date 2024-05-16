
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.PatientFollowupHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientFollowupHistoryRepo extends JpaRepository<PatientFollowupHistory, Long> {
            @Query(value = " select * from  PatientFollowupHistory where name like %:val% or type like %:val% ", nativeQuery = true)
            List<PatientFollowupHistory> search(@Param("val") String value);
    }





