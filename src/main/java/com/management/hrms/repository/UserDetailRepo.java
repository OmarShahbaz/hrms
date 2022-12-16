package com.management.hrms.repository;

import com.management.hrms.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepo extends JpaRepository<UserDetail, Integer> {
}
