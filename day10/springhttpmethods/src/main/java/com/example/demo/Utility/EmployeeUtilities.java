package com.example.demo.Utility;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

public class EmployeeUtilities {
	
	private EmployeeUtilities() {
		
	}
	
	public static EmployeeDto entityToDto(Employee save) {
		return EmployeeDto.builder().id(save.getId()).firstName(save.getFirstName()).lastName(save.getLastName()).mobileNo(save.getMobileNo()).aadharNo(save.getAadharNo()).panNo(save.getPanNo()).empNo(save.getEmpNo()).build();

	}
}
