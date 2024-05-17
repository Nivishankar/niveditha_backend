package com.excel.lms.utility;

import java.time.LocalDate;

import com.excel.lms.dto.PrimaryDto;
import com.excel.lms.entity.EmployeePrimaryInfo;

public class ObjectUtils {

	public static EmployeePrimaryInfo dtoToEntity(PrimaryDto dto) {
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
}
