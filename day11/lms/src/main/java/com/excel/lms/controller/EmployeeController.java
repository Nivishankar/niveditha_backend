package com.excel.lms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.PrimaryDto;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.response.CommonResponse;
import com.excel.lms.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/primaryadd")
	public ResponseEntity<CommonResponse<String>> addPrimaryMethod(@RequestBody PrimaryDto dto){
		String primary=employeeService.addPrimaryMethod(dto);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<String>builder().data(primary).isError(false).message("SUCCESS").build());
	}
}
