package com.flash.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flash.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
