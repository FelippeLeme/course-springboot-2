package com.flash.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flash.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
