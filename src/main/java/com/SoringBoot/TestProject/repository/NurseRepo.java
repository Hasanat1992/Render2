package com.SoringBoot.TestProject.repository;

import com.SoringBoot.TestProject.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepo extends JpaRepository<Nurse, Long> {

}
