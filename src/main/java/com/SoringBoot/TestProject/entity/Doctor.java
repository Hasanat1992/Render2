package com.SoringBoot.TestProject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "doctors")
public class Doctor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private Long department_id ;
    private Long mobile  ;
    private Long phone ;
    private String email ;
    private Long visit_price ;
    private Long followup_price ;
    private String note ;
    private Long departmentName ;

    @CreationTimestamp
    private LocalDate createdAt ;

    @UpdateTimestamp
    private LocalDate updatedAt ;
    private String createdBy ;
    private String updatedBy ;
    private Boolean active = true;
    private Boolean deleted = false;
}


