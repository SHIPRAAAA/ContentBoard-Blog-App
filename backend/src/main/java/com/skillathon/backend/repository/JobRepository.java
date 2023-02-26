package com.skillathon.backend.repository;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import com.skillathon.backend.model.JobModel;

public interface JobRepository extends JpaRepository<JobModel, Long> {
    // JobModel findByJobTitle(String jobTitle);

    // JobModel findByJobDescription(String jobDescription);
    // JobModel findBySalary(Integer salary);
    // JobModel findByExp(Integer exp);
    JobModel findTopByOrderByIdDesc();
}
