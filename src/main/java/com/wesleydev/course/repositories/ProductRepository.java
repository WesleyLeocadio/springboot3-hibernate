package com.wesleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleydev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
