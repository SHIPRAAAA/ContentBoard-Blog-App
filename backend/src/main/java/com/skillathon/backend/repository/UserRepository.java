package com.skillathon.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillathon.backend.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	// List<UserModel> findByGenera(String genera);
	public Optional<UserModel> findByEmail(String email);

	UserModel findTopByOrderByIdDesc();

}
