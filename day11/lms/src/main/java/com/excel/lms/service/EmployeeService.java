package com.excel.lms.service;

import org.springframework.stereotype.Service;

import com.excel.lms.dto.EducationListDto;
import com.excel.lms.dto.PrimaryDto;
import com.excel.lms.dto.SecondaryDto;
import com.excel.lms.dto.TechSkillListDto;
import com.excel.lms.entity.EmployeePrimaryInfo;


public interface EmployeeService {

	 String addPrimaryMethod(PrimaryDto dto);

	String addSecondaryMethod(SecondaryDto dto);

	String addEducationMethod(EducationListDto dto);

	String addTechSkillMethod(TechSkillListDto dto);

}
