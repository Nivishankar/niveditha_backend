package com.excelspring.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import com.excelspring.springjdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImple implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertStudent(Student student) {
		String query="insert into student  values(?,?,?)";
		jdbcTemplate.update(query,student.getId(),student.getName(),student.getAge());
		System.out.println("data insert successfully");
	}

	@Override
	public void updateStudent(Student student) {
		String query="update student set name=? where id=?";
		jdbcTemplate.update(query,student.getName(),student.getId());
		System.out.println("data updated successfully");


	}

	@Override
	public void deleteStudent(int id) {
		String query="delete from student where id=?";
		jdbcTemplate.update(query,id);
		System.out.println("data deleted successfully");

	}

	@Override
	public void fetchStudent() {
		
		String query = "select * from Student";
		jdbcTemplate.query(query, new RowMapper());
//		ResultSet std=jdbcTemplate.query(fetchquery,new ResultSetExtractor<List<Student>>());
//		System.out.println("id="+std.getId()+","+"name="+std.getName()+","+"age="+std.getAge());;
	}

}
