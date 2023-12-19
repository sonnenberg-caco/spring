package com.example.demo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
