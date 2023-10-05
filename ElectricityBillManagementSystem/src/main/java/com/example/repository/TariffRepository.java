package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Tariff;

@Repository
public interface TariffRepository extends JpaRepository<Tariff, Integer>{

}
