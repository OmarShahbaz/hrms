package com.management.hrms.dto;

import lombok.Data;

import java.util.Date;

public @Data class UserDto {

    private int uid;

    private String firstName;

    private String middleName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String address;

    private String city;

    private Date joiningDate;

    private double salary;

    private String gender;

    private String maritalStatus;

    private Date dateOfBirth;

    private String emergencyNumber;

    private Date userCreated;


}
