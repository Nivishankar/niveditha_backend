package com.excel.lms.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@JoinColumn(name="primaryinfo_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
