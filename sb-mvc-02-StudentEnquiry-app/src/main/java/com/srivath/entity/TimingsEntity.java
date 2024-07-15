package com.srivath.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "timings")
public class TimingsEntity {
	
	@Id
	@Column(name = "tid")
	private Integer id;
	@Column(name = "tvalue")
	private String value;
}
