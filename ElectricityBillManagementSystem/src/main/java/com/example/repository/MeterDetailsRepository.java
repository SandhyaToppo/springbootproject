package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.MeterDetails;

@Repository
public interface MeterDetailsRepository extends JpaRepository<MeterDetails, Long> {

}
