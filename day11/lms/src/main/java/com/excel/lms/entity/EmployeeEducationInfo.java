package com.excel.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEducationInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer education_id;
	
	private String educationType;
	private Integer yearofPassing;
	private Double percentage;
	private String universityName;
	private String institueName;
	private String specialization;
	private String state;
}
