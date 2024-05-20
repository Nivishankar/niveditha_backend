package com.excel.lms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.EducationListDto;
import com.excel.lms.dto.PrimaryDto;
import com.excel.lms.dto.SecondaryDto;
import com.excel.lms.dto.TechSkillListDto;
import com.excel.lms.response.CommonResponse;
import com.excel.lms.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/primaryadd")
	public ResponseEntity<CommonResponse<String>> addPrimaryMethod(@RequestBody PrimaryDto dto){
		String primary=employeeService.addPrimaryMethod(dto);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<String>builder().data(primary).message("SUCCESS").build());
	}
	
	@PostMapping("/secondaryadd")
	public ResponseEntity<CommonResponse<String>> addSecondaryMethod(@RequestBody SecondaryDto dto){
		String secondary=employeeService.addSecondaryMethod(dto);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<String>builder().data(secondary).message("SUCCESS").build());
	}
	
	@PostMapping("/educationadd")
	public ResponseEntity<CommonResponse<String>> addEducationMethod(@RequestBody EducationListDto dto){
		String education=employeeService.addEducationMethod(dto);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<String>builder().data(education).message("SUCCESS").build());
	}
	
	@PostMapping("/skillsadd")
	public ResponseEntity<CommonResponse<String>> addTechSkillsMethod(@RequestBody TechSkillListDto dto){
		String skill=employeeService.addTechSkillMethod(dto);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<String>builder().data(skill).message("SUCCESS").build());
	}
}
