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
public class EmployeeBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bank_id;
	
	private Long accountNo;
	private String bankName;
	private String accountType;
	private String ifscCode;
	private String branch;
	private String state;
}
