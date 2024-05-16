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
public class EmployeeAddressInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer address_id;
	
	private String addressType;
	private Integer doorNo;
	private String street;
	private String loacality;
	private String city;
	private String state;
	private Integer pincode;
	private String landmark;
}
