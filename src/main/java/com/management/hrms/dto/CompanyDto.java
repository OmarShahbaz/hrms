package com.management.hrms.dto;

import lombok.Data;

import java.util.Date;

public @Data class CompanyDto {

    private int cid;

    private String name;

    private String domain;

    private String contactNumber;

    private String address;

    private String city;

    private String logo;

    private boolean isActive;

    private Date dateCreated;
}
