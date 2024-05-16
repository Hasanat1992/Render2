package com.SoringBoot.TestProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "nurses")
public class Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private Long address ;
    private Long salary  ;
    private Long batch_no;


    @CreationTimestamp
    private LocalDate createdAt ;

    @UpdateTimestamp
    private LocalDate updatedAt ;
    private String createdBy ;
    private String updatedBy ;
    private Boolean active = true;
    private Boolean deleted = false;

}
