package com.flash.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flash.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
