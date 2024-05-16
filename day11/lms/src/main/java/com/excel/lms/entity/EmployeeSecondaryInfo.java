package com.excel.lms.entity;

import org.aspectj.internal.lang.annotation.ajcITD;

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
public class EmployeeSecondaryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer secondaryinfo_id;
	
	private String panNo;
	private Integer aadharNo;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passportNo;
	private String maritalStatus;

}
