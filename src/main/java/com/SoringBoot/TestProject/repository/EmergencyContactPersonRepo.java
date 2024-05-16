
package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.EmergencyContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmergencyContactPersonRepo extends JpaRepository<EmergencyContactPerson, Long> {

        @Query(value = " select * from emergencyContactPerson where name like %:val% or type like %:val% ", nativeQuery = true)
        List<EmergencyContactPerson> search(@Param("val") String value);

}






