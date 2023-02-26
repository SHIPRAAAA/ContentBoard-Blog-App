package com.skillathon.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillathon.backend.model.JobModel;
import com.skillathon.backend.repository.JobRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JobService {

	@Autowired
	private final JobRepository jobRepository;

	public List<JobModel> getAllJob() {
		return jobRepository.findAll();

	}

	public JobModel getJobById(long id) {
		return jobRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found" + id));
	}

	public JobModel addJob(JobModel job) {
		job.setId(jobRepository.findTopByOrderByIdDesc().getId() + 1);
		return jobRepository.save(job);
	}

	public void deleteJob(long id) {
		JobModel job = getJobById(id);
		jobRepository.delete(job);
	}

	public JobModel updateJob(JobModel job) {
		return addJob(job);
	}
}
