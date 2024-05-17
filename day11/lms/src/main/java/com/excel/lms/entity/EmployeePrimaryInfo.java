package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	private String nationality;

	
	@Enumerated(EnumType.STRING)
	private Designation designation;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
		
	
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeeStatus;
	
	//mapping
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private EmployeeSecondaryInfo employeeSecondaryInfo;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<EmployeeEducationInfo> employeeEducationInfos;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<EmployeeAddressInfo> employeeAddressInfos;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private EmployeeBankDetails employeeBankDetails;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private List<EmployeeTechnicalskillsInfo> employeeTechnicalskillsInfos;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<EmployeeExperienceInfo> employeeExperienceInfos;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<EmployeeContactInfo> employeeContactInfos; 
	
}
