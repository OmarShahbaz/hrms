package com.management.hrms.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "userDetails")
public @Data class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userDetailsId")
    private int udid;
}

