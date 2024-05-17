package com.excel.lms.dto;

import java.time.LocalDate;

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
public class ExperienceDto {

private Integer experience_id;
	
	private String companyName;
	private Integer yearofExperience;
	private LocalDate dateofJoining;
	private LocalDate dateofRelieving;
	private String designation;
	private String location;
}
