package com.skillathon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillathon.backend.model.JobModel;

public interface JobRepository extends JpaRepository<JobModel, Long> {

}
