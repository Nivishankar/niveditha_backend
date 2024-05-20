package com.excel.lms.utility;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.excel.lms.dto.EducationDto;
import com.excel.lms.dto.PrimaryDto;
import com.excel.lms.dto.SecondaryDto;
import com.excel.lms.dto.TechnicalSkillDto;
import com.excel.lms.entity.EmployeeEducationInfo;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.EmployeeTechnicalskillsInfo;

public class ObjectUtils {

	public static EmployeePrimaryInfo dtoToPrimaryEntity(PrimaryDto dto) {
	EmployeePrimaryInfo primary=EmployeePrimaryInfo.builder()
		.employeeId(dto.getEmployeeId())
		.employeeName(dto.getEmployeeName())
		.dataOfBirth(dto.getDataOfBirth())
		.dataofJoining(dto.getDataofJoining())
		.emailId(dto.getEmailId())
		.bloodGroup(dto.getBloodGroup())
		.nationality(dto.getNationality())
		.designation(dto.getDesignation())
		.gender(dto.getGender()).employeeStatus(dto.getEmployeeStatus()).
		build();
	return primary;
	}

	public static EmployeeSecondaryInfo dtoToSecondaryEntity(SecondaryDto dto) {
		EmployeeSecondaryInfo secondary=EmployeeSecondaryInfo.builder()
				.aadharNo(dto.getAadharNo())
				.panNo(dto.getPanNo())
				.fatherName(dto.getFatherName())
				.motherName(dto.getMotherName())
				.spouseName(dto.getSpouseName())
				.passportNo(dto.getPassportNo())
				.maritalStatus(dto.getMaritalStatus()).build();
		return secondary;
	}

	public static List<EmployeeEducationInfo> dtoToEducationEntity(List<EducationDto> dto) {
		List<EmployeeEducationInfo> educations=dto.stream().map(edu->EmployeeEducationInfo.builder()
				.educationType(edu.getEducationType())
				.yearofPassing(edu.getYearofPassing())
				.percentage(edu.getPercentage())
				.universityName(edu.getUniversityName())
				.institueName(edu.getInstitueName())
				.specialization(edu.getSpecialization())
				.state(edu.getState()).build()).collect(Collectors.toList());
		return educations;
	}

	public static EmployeeTechnicalskillsInfo dtoToTechSkillEntity(TechnicalSkillDto dto) {
		EmployeeTechnicalskillsInfo techSkill=EmployeeTechnicalskillsInfo.builder()
				.skillType(dto.getSkillType())
				.skillRating(dto.getSkillRating())
				.yearofExperience(dto.getYearofExperience())
				.employeePrimaryInfos(new ArrayList<>()).build();
		return techSkill;
	}

	
}
