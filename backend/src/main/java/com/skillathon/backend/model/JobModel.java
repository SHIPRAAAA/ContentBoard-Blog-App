package com.skillathon.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job")
public class JobModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "company", nullable = false)
	private String company;

	@Column(name = "jobTitle", nullable = false)
	private String jobTitle;

	@Column(name = "jobDescription", nullable = false)
	private String jobDescription;

	@Column(name = "salary", nullable = false)
	private Integer salary;

	@Column(name = "exp", nullable = false)
	private Integer exp;

}
