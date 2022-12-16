package com.management.hrms.dto;

import com.management.hrms.model.Company;
import com.management.hrms.model.Role;
import com.management.hrms.model.User;
import lombok.Data;

public @Data class UserDetailDto {
    private int udid;

    private User user;

    private Company companyId;

    private Role role;
}
