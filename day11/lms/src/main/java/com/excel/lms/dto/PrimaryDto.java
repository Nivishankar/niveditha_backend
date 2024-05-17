package com.excel.lms.dto;

import java.time.LocalDate;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrimaryDto {

private Integer primaryinfo_id;
	
	private String employeeId;
	private String employeeName;
	private LocalDate dataofJoining;
	private LocalDate dataOfBirth;
	private String emailId;
	private String bloodGroup;
	private String nationality;
	private Designation designation;
	private Gender gender;
	private EmployeeStatus employeeStatus;
}
