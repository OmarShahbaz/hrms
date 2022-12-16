package com.management.hrms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "companies")
public @Data class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    @Column(name = "name")
    private String name;
    @Column(name = "domain")
    private String domain;
    @Column(name = "number")
    private String contactNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "logoUrl")
    private String logo;
    @Column(name = "status")
    private boolean isActive;
    @Column(name = "created")
    private Date dateCreated;
}
