package com.example.demo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
