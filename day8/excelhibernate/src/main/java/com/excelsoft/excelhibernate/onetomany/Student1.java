package com.excelsoft.excelhibernate.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "student_id")
	private int id;
	
	@Column(name = "student_name")
	private String name;
	
	@Column(name = "student_age")
	private int age;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student1")
	private List<Laptop1> laptops;
}
