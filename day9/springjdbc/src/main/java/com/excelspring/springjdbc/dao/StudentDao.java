package com.excelspring.springjdbc.dao;

import com.excelspring.springjdbc.entity.Student;

public interface StudentDao {

	public void insertStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(int id);

	public void fetchStudent();
		
	

}
