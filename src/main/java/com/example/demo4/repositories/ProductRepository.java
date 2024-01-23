package com.example.demo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
