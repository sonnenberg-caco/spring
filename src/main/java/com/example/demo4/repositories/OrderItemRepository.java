package com.example.demo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
