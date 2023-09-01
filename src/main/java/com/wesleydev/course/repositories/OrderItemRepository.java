package com.wesleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleydev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
