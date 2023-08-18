package com.wesleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleydev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
