package com.excelsoft.excelhibernate.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Laptop1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lap_id;
	private String lap_brand;
	private String lap_no;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Student1 student;
}
