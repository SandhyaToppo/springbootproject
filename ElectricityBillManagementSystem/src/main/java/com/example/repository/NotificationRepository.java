package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer>{

}
