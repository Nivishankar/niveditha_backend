package com.excel.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EducationDto {


   private Integer education_id;
	
	private String educationType;
	private Integer yearofPassing;
	private Double percentage;
	private String universityName;
	private String institueName;
	private String specialization;
	private String state;
}
