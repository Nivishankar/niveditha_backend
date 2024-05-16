package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Utility.EmployeeUtilities;
import com.example.demo.constant.EmployeeConstant;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
		return EmployeeUtilities.entityToDto(save);
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
		List<Employee> employee=employeeRepository.findAll();
		return employee.stream().map(e->EmployeeDto.builder().id(e.getId()).firstName(e.getFirstName()).lastName(e.getLastName()).mobileNo(e.getMobileNo()).aadharNo(e.getAadharNo()).panNo(e.getPanNo()).empNo(e.getEmpNo()).build()).toList();
//		return employee.stream().map(EmployeeUtilities::entityToDto).toList();
	}

	@Override
	public EmployeeDto fetchByIdMethod(int id) {
	Optional<Employee> optional=employeeRepository.findById(id);
	if(optional.isPresent()) {
		Employee emp=optional.get();
//	return EmployeeDto.builder().id(emp.getId()).firstName(emp.getFirstName()).lastName(emp.getLastName()).mobileNo(emp.getMobileNo()).aadharNo(emp.getAadharNo()).panNo(emp.getPanNo()).empNo(emp.getEmpNo()).build();
		return EmployeeUtilities.entityToDto(emp);
	}else {
		throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_ID_NOT_FOUND);

	}
//	}catch(EmployeeNotFoundException e) {
//		throw e;
//	}catch(Exception e) {
//		log.error("Error getting while updating employee");
//		throw new EmployeeNotFoundException("Something went wrong");
//	}
	}

	@Override
	public void updateMethod(int id,EmployeeDto dto) {
		Optional<Employee> optional= employeeRepository.findById(id);
			if(optional.isPresent()) {
				Employee emp=optional.get();
				emp.setMobileNo(dto.getMobileNo());
				employeeRepository.save(emp);
			}else {	
				throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_ID_NOT_FOUND);
		}
		
		
		
		}
	}

