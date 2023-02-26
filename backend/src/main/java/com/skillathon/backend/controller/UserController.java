package com.skillathon.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillathon.backend.model.UserModel;
import com.skillathon.backend.service.UserService;

@Component
@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

	/*
	 * @GetMapping
	 * public String Getalluser() {
	 * return "I am working ";
	 * }
	 */

	@Autowired
	private UserService userService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<UserModel> getAllUser() {
		return userService.getAllUser();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public UserModel getUserById(@PathVariable long id) {
		return userService.getUserById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public UserModel addUser(@RequestBody UserModel user) {
		// System.out.println(httpEntity.getBody());
		return userService.addUser(user);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteUserById(@PathVariable long id) {
		userService.deleteUser(id);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public UserModel updateUser(@RequestBody UserModel user) {
		return userService.updateUser(user);
	}
}
