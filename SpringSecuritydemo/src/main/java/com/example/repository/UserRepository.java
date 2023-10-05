package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String name);

	public User findByUsernameAndPassword(String name, String pass);

}
