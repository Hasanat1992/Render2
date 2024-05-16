package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicalRecordRepo extends JpaRepository<MedicalRecord, Long> {
        @Query(value = " select * from MedicalRecords where name like %:val% or type like %:val% ", nativeQuery = true)
        List<MedicalRecord> search(@Param("val") String value);

}

