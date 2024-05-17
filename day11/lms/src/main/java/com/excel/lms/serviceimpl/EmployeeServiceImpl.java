package com.excel.lms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.PrimaryDto;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.service.EmployeeService;
import com.excel.lms.utility.ObjectUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String addPrimaryMethod(PrimaryDto dto) {
		EmployeePrimaryInfo primary=ObjectUtils.dtoToEntity(dto);
	EmployeePrimaryInfo	primaryInfo=employeeRepository.save(primary);
	return primaryInfo.getEmployeeId();
				
	}

}
