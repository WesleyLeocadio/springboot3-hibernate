package com.wesleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleydev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
