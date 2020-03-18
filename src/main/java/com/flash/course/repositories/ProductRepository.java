package com.flash.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flash.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
