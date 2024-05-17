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
public class TechnicalSkillDto {

private Integer skill_id;
	
	private String skillType;
	private Integer skillRating;
	private Integer yearofExperience;
	
}
