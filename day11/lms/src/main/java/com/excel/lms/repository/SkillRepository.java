package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excel.lms.entity.EmployeeTechnicalskillsInfo;

@Repository
public interface SkillRepository extends JpaRepository<EmployeeTechnicalskillsInfo, Integer>{

	Optional<EmployeeTechnicalskillsInfo> findBySkillTypeAndSkillRatingAndYearofExperience(String skillType,
			Integer skillRating, Integer yearofExperience);

}
