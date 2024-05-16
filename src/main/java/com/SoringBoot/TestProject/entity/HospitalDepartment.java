//package com.crud.spring.springCRUD.entity;

//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;

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
@Table(name = "HospitalDepartments")
public class HospitalDepartment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private Long phone;
    private String email;
    private String note;

    @CreationTimestamp
    private LocalDateTime createdAt;
//    @LastModifiedDate

    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private Long createdBy;
    private Long updatedBy;
    private Boolean active = true;
    private Boolean deleted = false;

}




