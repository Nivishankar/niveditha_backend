package com.excelspring.spring.hibernate;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excelspring.spring.hibernate.dao.EmployeeDao;
import com.excelspring.spring.hibernate.entities.Employee;

public class App 
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfiguration.class);
    	EmployeeDao dao=context.getBean(EmployeeDao.class);
    	Employee emp=new Employee();
    	boolean check=true;
    	System.out.println("CRUD operation");
    	while(check) {
    	System.out.println("Enter 1 to add employee");
    	System.out.println("Enter 2 to update employee");
    	System.out.println("Enter 3 to fetch employee");
    	System.out.println("Enter 4 to fetchAll employee");
    	System.out.println("Enter 5 to delete employee");

    	int input=sc.nextInt();
    	switch(input){
    		case 1:
    			System.out.println("Enter emp name");
    			emp.setEmp_name(sc.next());
    			System.out.println("Enter emp salary");
    			
    			dao.insertEmp(emp);
    			break;
    		case 2:
    			System.out.println("enter the id to update");
    			Employee e=dao.fetchEmp(sc.nextInt());
    			System.out.println("Enter emp name");
    			e.setEmp_name(sc.next());
    			System.out.println("Enter emp salary");
    			e.setEmp_salary(sc.nextDouble());
    			dao.updateEmp(e);
    			break;
    		case 3:
    			System.out.println("enter the id to fetch");
    			Employee e1=dao.fetchEmp(sc.nextInt());
    			System.out.println(e1);
    			break;
    			
    		case 4:
    			dao.fetchAllEmp();
    			break;
    		case 5:
    			System.out.println("enter the id to delete");
    			Employee e2=dao.fetchEmp(sc.nextInt());

    			dao.deleteEmp(e2);
    			break;
    			
    		default:
    			System.out.println("please enter a valid number");
    			break;
    	}
    	
    	System.out.println("you want to continue?(y/n)");
    	check="y".equalsIgnoreCase(sc.next());
    	}

    }
}
