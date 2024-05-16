package com.SoringBoot.TestProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "roles")
@Getter
@Setter
//new
@RequiredArgsConstructor
public class Role {

    @Id
//    new
    @Column(nullable = false, updatable = false)
    private String roleName;

    @Column
    private String roleDescription;

    //    @CreationTimestamp
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime dateCreated;

    //    @UpdateTimestamp
    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime lastUpdated;

    //    private Boolean active = true;
    private Boolean active = false;




//    new
    @PrePersist
    void createdAt() {
        this.dateCreated = this.lastUpdated = LocalDateTime.now();
    }


//    new
    @PreUpdate
    void updatedAt() {
        this.lastUpdated = LocalDateTime.now();
    }
}

