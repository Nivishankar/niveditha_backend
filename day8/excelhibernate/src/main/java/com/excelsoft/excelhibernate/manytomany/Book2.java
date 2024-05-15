package com.excelsoft.excelhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="book2")
public class Book2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bk_id;
	private String bk_title;
	
	@ManyToMany
	private List<Student2> students;
}
