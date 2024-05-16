
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.PatientBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientBillRepo extends JpaRepository<PatientBill, Long> {
            @Query(value = " select * from patientsBill where name like %:val% or type like %:val% ", nativeQuery = true)
            List<PatientBill> search(@Param("val") String value);

}






