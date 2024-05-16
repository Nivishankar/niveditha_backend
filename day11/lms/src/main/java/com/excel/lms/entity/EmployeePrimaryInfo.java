package com.excel.lms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePrimaryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer primaryinfo_id;
	
	private String employeeId;
	private String employeeName;
	private LocalDate dataofJoining;
	private LocalDate dataOfBirth;
	private String emailId;
	private String bloodGroup;
	private String designation;
	private String gender;
	private String nationality;
	private String employeeStatus;
}
