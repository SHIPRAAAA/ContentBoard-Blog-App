package com.skillathon.backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillathon.backend.model.JobModel;

@Repository
public interface JobRepository extends JpaRepository<JobModel,Long>{
	//List<UserModel> findByGenera(String genera);
		
}

