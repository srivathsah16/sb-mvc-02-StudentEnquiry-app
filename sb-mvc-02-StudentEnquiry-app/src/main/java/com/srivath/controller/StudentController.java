package com.srivath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.srivath.entity.Course;
import com.srivath.entity.StudentEnquiry;
import com.srivath.entity.TimingsEntity;
import com.srivath.repo.CourseRepo;
import com.srivath.repo.StudentEnquiryRepo;
import com.srivath.repo.TimingsRepo;

@Controller
public class StudentController {

	@Autowired
	private CourseRepo courseRepo;
	@Autowired
	private TimingsRepo timingsRepo;
	@Autowired
	private StudentEnquiryRepo studentRepo;

	@GetMapping("/")
	public String home(Model model) {
		System.out.println("home method called...");
		List<Course> courses = courseRepo.findAll();
		System.out.println("courses=" + courses);
		List<TimingsEntity> timings = timingsRepo.findAll();
		System.out.println("timings=" + timings);
		model.addAttribute("course", courses);
		model.addAttribute("timings", timings);
		return "index";
	}

	@PostMapping("/student")
	public String studentEnquiry(@RequestBody StudentEnquiry enq, Model model) {
		System.out.println("studentEnquiry method triggered,"+enq);
		studentRepo.save(enq);
		model.addAttribute("message", "Student Enquiry saved successfully.");
		return "index";

	}

}
