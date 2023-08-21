package com.wesleydev.course.resources;

import com.wesleydev.course.entities.User;
import com.wesleydev.course.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
    	List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value= "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}