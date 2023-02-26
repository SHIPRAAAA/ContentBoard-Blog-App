package com.skillathon.backend.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillathon.backend.model.UserModel;
import com.skillathon.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	@Autowired
	private final UserRepository userRepository;

	public List<UserModel> getAllUser() {
		List<UserModel> userList = userRepository.findAll();
		for (UserModel user : userList) {
			user.setPassword(null);
		}
		return userList;

	}

	public UserModel getUserById(long id) {
		UserModel user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found" + id));
		user.setPassword(null);
		return user;
	}

	public UserModel addUser(UserModel user) {
		UserModel userCreated = userRepository.save(user);
		userCreated.setPassword(null);
		return userCreated;
	}

	public Optional<UserModel> findbyEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public void deleteUser(long id) {
		UserModel user = getUserById(id);
		userRepository.delete(user);
	}

	public UserModel updateUser(UserModel user) {
		return addUser(user);
	}
}
