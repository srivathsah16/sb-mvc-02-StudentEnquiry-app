package com.srivath.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer enquiryId;
	private String studentName;
	private String studentEmail;
	private String gender;
	private String course;
	private List<String> timings;
	
}
