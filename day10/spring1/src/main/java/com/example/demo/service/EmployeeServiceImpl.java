package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constant.EmployeeConstant;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	List<Employee> emps = new ArrayList<>();

	@Override
	public EmployeeDto addMethod(EmployeeDto empdto) {
		Employee emp=Employee.builder().firstName(empdto.getFirstName()).lastName(empdto.getLastName()).mobileNo(empdto.getMobileNo()).aadharNo(empdto.getAadharNo()).panNo(empdto.getPanNo()).empNo(empdto.getEmpNo()).build();
//		emp.setId((int) (Math.random()*10));
//		emps.add(emp);
		
		Employee save=employeeRepository.save(emp);
		return EmployeeDto.builder().id(save.getId()).firstName(save.getFirstName()).lastName(save.getLastName()).mobileNo(save.getMobileNo()).aadharNo(save.getAadharNo()).panNo(save.getPanNo()).empNo(save.getEmpNo()).build();
		
	}

	@Override
	public void deleteMethod(EmployeeDto dto) {
		Optional<Employee> optional=employeeRepository.findById(dto.getId());
		if(optional.isPresent()) {
			employeeRepository.delete(optional.get());
			throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_DELETED_SUCCESS);
		}else {
			throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_ID_NOT_FOUND);
		}
	}

	@Override
	public List<EmployeeDto> fetchAllMethod() {
		return employeeRepository.findAll().stream().map(e->EmployeeDto.builder().id(e.getId()).firstName(e.getFirstName()).lastName(e.getLastName()).mobileNo(e.getMobileNo()).aadharNo(e.getAadharNo()).panNo(e.getPanNo()).empNo(e.getEmpNo()).build()).toList();
	}

	@Override
	public EmployeeDto fetchByIdMethod(EmployeeDto dto) {
		
	Employee emp=(Employee) employeeRepository.findById(dto.getId()).get();
	return EmployeeDto.builder().id(emp.getId()).firstName(emp.getFirstName()).lastName(emp.getLastName()).mobileNo(emp.getMobileNo()).aadharNo(emp.getAadharNo()).panNo(emp.getPanNo()).empNo(emp.getEmpNo()).build();
	}

}
