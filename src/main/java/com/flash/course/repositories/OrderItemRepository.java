package com.flash.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flash.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
