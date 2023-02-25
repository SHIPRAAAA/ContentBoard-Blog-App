package com.skillathon.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillathon.backend.model.JobModel;
import com.skillathon.backend.service.JobService;


@Component
@RestController
@RequestMapping("/job")
public class JobController {

	/*@GetMapping
	public String Getalluser() {
		return "I am working ";
	}*/
	
	@Autowired
	private JobService jobService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<JobModel> getAllJob(){
		return jobService.getAllJob();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public JobModel getJobById(@PathVariable long id) {
		return jobService.getJobById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public JobModel addJob(@RequestBody JobModel job) {
		return jobService.addJob(job);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteJobById(@PathVariable long id) {
		jobService.deleteJob(id);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public JobModel updateJob(@RequestBody JobModel job) {
		return jobService.updateJob(job);
	}
}