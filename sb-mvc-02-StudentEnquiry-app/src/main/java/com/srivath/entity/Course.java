package com.srivath.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
 
@Entity
@Data
@Table(name = "courses")
public class Course {

	@Id
	@Column(name = "cid")
	private Integer id;
	@Column(name = "cname")
	private String name;      
}
