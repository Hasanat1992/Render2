package com.SoringBoot.TestProject.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "MedicalRecords ")


public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private Long patientId;
//    private Long doctorId;
    private String diagnosis;
    private String treatment;
    private String prescription;
    private String testResult;
    private Long historyID;

    @CreationTimestamp
    private LocalDateTime createdAt;

// @LastModifiedDate
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private Long createdBy;
    private Long updatedBy;
    private Boolean active = true;
    private Boolean deleted = false;








}


