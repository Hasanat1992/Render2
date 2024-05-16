
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.HospitalDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HospitalDepartmentRepo extends JpaRepository<HospitalDepartment, Long> {
        @Query(value = " select * from hospitalDepartments where name like %:val% or type like %:val% ", nativeQuery = true)
        List<HospitalDepartment> search(@Param("val") String value);

}



