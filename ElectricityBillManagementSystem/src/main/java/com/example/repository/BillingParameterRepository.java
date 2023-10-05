package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.BillingParameter;

@Repository
public interface BillingParameterRepository extends JpaRepository<BillingParameter, Long> {

//	public List<BillingParameter> findByBillNumber(String number);

}
