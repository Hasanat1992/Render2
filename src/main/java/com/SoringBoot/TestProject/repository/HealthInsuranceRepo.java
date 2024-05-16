
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.HealthInsurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HealthInsuranceRepo extends JpaRepository<HealthInsurance, Long> {

        @Query(value = " select * from healthInsurance where name like %:val% or type like %:val% ", nativeQuery = true)
        List<HealthInsurance> search(@Param("val") String value);

}





