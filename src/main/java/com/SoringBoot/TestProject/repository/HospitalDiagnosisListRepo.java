
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.HospitalDiagnosisList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HospitalDiagnosisListRepo extends JpaRepository<HospitalDiagnosisList, Long> {
            @Query(value = " select * from hospitalDiagnosisList where name like %:val% or type like %:val% ", nativeQuery = true)
            List<HospitalDiagnosisList> search(@Param("val") String value);

}





