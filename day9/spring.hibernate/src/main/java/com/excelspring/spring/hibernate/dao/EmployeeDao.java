package com.excelspring.spring.hibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.excelspring.spring.hibernate.entities.Employee;

@Component
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void insertEmp(Employee emp) {
		int res = (Integer) this.hibernateTemplate.save(emp);
		if (res != 0) {
			System.out.println("Record inserted successfully");
		} else {
			System.out.println("Record not inserted ");

		}

	}

	@Transactional
	public void updateEmp(Employee e) {
		this.hibernateTemplate.update(e);
		System.out.println("Record updated Succesfully");
	}

	@Transactional
	public Employee fetchEmp(int id) {
		Employee e = this.hibernateTemplate.load(Employee.class, id);
		return e;
	}

	@Transactional
	public void fetchAllEmp() {
		List<Employee> empList = this.hibernateTemplate.loadAll(Employee.class);
		System.out.println(empList);

	}

	@Transactional
	public void deleteEmp(Employee emp) {
		this.hibernateTemplate.delete(emp);
		System.out.println("Record deleted successfully");
	}
}
