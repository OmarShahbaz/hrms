package com.management.hrms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "users")
public @Data class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Column(name = "")
    private String firstName;

    @Column(name = "")
    private String middleName;

    @Column(name = "")
    private String lastName;

    @Column(name = "")
    private String email;

    @Column(name = "")
    private String phoneNumber;

    @Column(name = "")
    private String address;

    @Column(name = "")
    private String city;

    @Column(name = "")
    private Date joiningDate;

    @Column(name = "")
    private double salary;

    @Column(name = "")
    private String gender;

    @Column(name = "")
    private String maritalStatus;

    @Column(name = "")
    private Date dateOfBirth;

    @Column(name = "")
    private String emergencyNumber;

    @Column(name = "")
    private Date userCreated;

}
