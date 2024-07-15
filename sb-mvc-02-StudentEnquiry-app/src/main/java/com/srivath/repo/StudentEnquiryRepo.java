package com.srivath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srivath.entity.StudentEnquiry;

public interface StudentEnquiryRepo extends JpaRepository<StudentEnquiry, Integer> {

}
