package com.excel.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeTechnicalskillsInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer technical_id;
	
	private String skillType;
	private Integer skillRating;
	private Integer yearofExperience;
}
