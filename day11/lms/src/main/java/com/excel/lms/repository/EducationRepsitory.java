package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excel.lms.entity.EmployeeEducationInfo;


@Repository
public interface EducationRepsitory extends JpaRepository<EmployeeEducationInfo, Integer> {

	

}
