package com.example.demo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
