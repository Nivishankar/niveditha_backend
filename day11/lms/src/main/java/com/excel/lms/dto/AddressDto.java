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
public class AddressDto {


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
