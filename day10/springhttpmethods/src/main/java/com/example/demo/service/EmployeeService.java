package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto addMethod(EmployeeDto empdto);

	void deleteMethod(EmployeeDto dto);

	List<EmployeeDto> fetchAllMethod();

	EmployeeDto fetchByIdMethod(int id);

	void updateMethod(int id,EmployeeDto dto);

}
