package com.excel.lms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeTechnicalskillsInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer skill_id;
	
	private String skillType;
	private Integer skillRating;
	private Integer yearofExperience;
	
	@JoinTable(name="employee_techskills",joinColumns=@JoinColumn(name="skill_id"),inverseJoinColumns = @JoinColumn(name="primaryinfo_id"))
	@ManyToMany(cascade = CascadeType.ALL)
	private List<EmployeePrimaryInfo> employeePrimaryInfos;
}
