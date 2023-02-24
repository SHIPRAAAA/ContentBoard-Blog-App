package com.skillathon.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillathon.backend.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>{
	//List<UserModel> findByGenera(String genera);
	
}
