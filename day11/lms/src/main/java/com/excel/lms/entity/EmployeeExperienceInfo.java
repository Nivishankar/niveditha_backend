package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
	
	@JoinColumn(name="primaryinfo_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
