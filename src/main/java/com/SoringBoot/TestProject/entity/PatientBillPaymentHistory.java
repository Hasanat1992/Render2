
package com.SoringBoot.TestProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "PatientsBillPaymentHistory")
public class PatientBillPaymentHistory {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bill_ID;
    private LocalDate paymentDate;
    private Long amountPaid;

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















