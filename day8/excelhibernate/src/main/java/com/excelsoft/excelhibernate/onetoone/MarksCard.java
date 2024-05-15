package com.excelsoft.excelhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="markscard")
public class MarksCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="marks_id")
	private int id;
	
//	@Column(name="marks_sub")
	private String sub;
}
