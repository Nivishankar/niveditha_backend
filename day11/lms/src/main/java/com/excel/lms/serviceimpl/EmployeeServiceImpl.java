package com.excel.lms.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.EducationListDto;
import com.excel.lms.dto.PrimaryDto;
import com.excel.lms.dto.SecondaryDto;
import com.excel.lms.dto.TechSkillListDto;
import com.excel.lms.entity.EmployeeEducationInfo;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.EmployeeTechnicalskillsInfo;
import com.excel.lms.exception.EmployeeExistanceException;
import com.excel.lms.repository.EducationRepsitory;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.SkillRepository;
import com.excel.lms.service.EmployeeService;
import com.excel.lms.utility.ObjectUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EducationRepsitory educationRepsitory;
	
	@Autowired
	private SkillRepository skillRepository;


	@Override
	public String addPrimaryMethod(PrimaryDto dto) {
		EmployeePrimaryInfo primary=ObjectUtils.dtoToPrimaryEntity(dto);
	EmployeePrimaryInfo	primaryInfo=employeeRepository.save(primary);
	return primaryInfo.getEmployeeId();
				
	}

	@Override
	public String addSecondaryMethod(SecondaryDto dto) {
		Optional<EmployeePrimaryInfo> employee= employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employee.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo=employee.get();
			EmployeeSecondaryInfo secondary=ObjectUtils.dtoToSecondaryEntity(dto);
			if(employeePrimaryInfo.getEmployeeSecondaryInfo()==null) {
				employeePrimaryInfo.setEmployeeSecondaryInfo(secondary);
				secondary.setEmployeePrimaryInfo(employeePrimaryInfo);
			}
//				else {
//				employeePrimaryInfo.getEmployeeSecondaryInfo().setAadharNo(dto.getAadharNo());
//				employeePrimaryInfo.getEmployeeSecondaryInfo().setPanNo(dto.getPanNo());
//			}
		employeeRepository.save(employeePrimaryInfo);
		return employeePrimaryInfo.getEmployeeId();
	}
		throw new EmployeeExistanceException("Employee Id not registered");
	}

	@Override
	public String addEducationMethod(EducationListDto dto) {
		
		Optional<EmployeePrimaryInfo> employee=employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employee.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo=employee.get();
			List<EmployeeEducationInfo> educations= ObjectUtils.dtoToEducationEntity(dto.getEducations());
			if(employeePrimaryInfo.getEmployeeEducationInfos()!=null) {
				employeePrimaryInfo.getEmployeeEducationInfos().stream().forEach(edu->educationRepsitory.delete(edu));
				
			}
			educations.stream().forEach(x->x.setEmployeePrimaryInfo(employeePrimaryInfo));
			employeePrimaryInfo.setEmployeeEducationInfos(educations);
			employeeRepository.save(employeePrimaryInfo);
			return employeePrimaryInfo.getEmployeeId();
		}
		throw new EmployeeExistanceException("Employee Id not registered");
	}

	@Override
	public String addTechSkillMethod(TechSkillListDto dto) {
		Optional<EmployeePrimaryInfo> employee=employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employee.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo=employee.get();
			List<EmployeeTechnicalskillsInfo> skills=dto.getSkills().stream().map(skill->{
				Optional<EmployeeTechnicalskillsInfo> optional=skillRepository.findBySkillTypeAndSkillRatingAndYearofExperience
						(skill.getSkillType(),skill.getSkillRating(),skill.getYearofExperience());
				
				return optional.isPresent()?optional.get():ObjectUtils.dtoToTechSkillEntity(skill);
				}).collect(Collectors.toList());
			
			if(employeePrimaryInfo.getEmployeeTechnicalskillsInfos()!=null) {
				employeePrimaryInfo.getEmployeeTechnicalskillsInfos().clear();
			}
			
			skills.stream().forEach(x->{
				if(!x.getEmployeePrimaryInfos().contains(employeePrimaryInfo))
					x.getEmployeePrimaryInfos().add(employeePrimaryInfo);
			});
			
			employeePrimaryInfo.setEmployeeTechnicalskillsInfos(skills);
			employeeRepository.save(employeePrimaryInfo);
			return employeePrimaryInfo.getEmployeeId();
		}
		
		
		throw new EmployeeExistanceException("Employee Id not registered");
	}

}
