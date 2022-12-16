package com.management.hrms.repository;

import com.management.hrms.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Integer> {
}
