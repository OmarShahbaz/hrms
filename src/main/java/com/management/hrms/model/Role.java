package com.management.hrms.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "roles")
public @Data class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rid;
    @Column(name = "role")
    private String roleName;
}
