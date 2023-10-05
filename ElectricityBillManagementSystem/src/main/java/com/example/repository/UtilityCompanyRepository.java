package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.UtilityCompany;

@Repository
public interface UtilityCompanyRepository extends JpaRepository<UtilityCompany, Long> {

}
