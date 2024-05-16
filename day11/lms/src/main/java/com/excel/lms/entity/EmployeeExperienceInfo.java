package com.excel.lms.entity;

import java.time.LocalDate;

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
public class EmployeeExperienceInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer experience_id;
	
	private String companyName;
	private Integer yearofExperience;
	private LocalDate dateofJoining;
	private LocalDate dateofRelieving;
	private String designation;
	private String location;
}
