package com.skillathon.backend.service;

import java.util.List;

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
		System.out.println(userRepository.findAll().toString());
		return userRepository.findAll();

	}

	public UserModel getUserById(long id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found" + id));
	}

	public UserModel addUser(UserModel user) {
		return userRepository.save(user);
	}

	public void deleteUser(long id) {
		UserModel user = getUserById(id);
		userRepository.delete(user);
	}

	public UserModel updateUser(UserModel user) {
		return userRepository.save(user);
	}
}
