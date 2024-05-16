
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.PatientBillPaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientBillPaymentHistoryRepo extends JpaRepository<PatientBillPaymentHistory, Long> {

        @Query(value = " select * from patientBillPaymentHistory where name like %:val% or type like %:val% ", nativeQuery = true)
        List<PatientBillPaymentHistory> search(@Param("val") String value);

}



