
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
@Table(name = "HealthInsurance")
public class HealthInsurance {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String zipcode;
    private String country;
    private Long mobile;
    private String email;

    @CreationTimestamp
    private LocalDateTime createdAt;

//  @LastModifiedDate
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private Long createdBy;
    private Long updatedBy;
    private Boolean active = true;
    private Boolean deleted = false;

}














