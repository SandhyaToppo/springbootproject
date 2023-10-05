package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Consumer;

@Repository
public interface ConsumerRepository  extends JpaRepository<Consumer, Long> {
	

}
