package com.excelspring.springjdbc;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excelspring.springjdbc.dao.StudentDao;
import com.excelspring.springjdbc.entity.Student;

public class App {
	
	static Scanner sc=new Scanner(System.in);

	public static void main( String[] args )
    {
    	ApplicationContext context= new AnnotationConfigApplicationContext(Jdbcconfiguration.class);
 
    	StudentDao dao=context.getBean("studentDao",StudentDao.class);
    	
    	Student student=new Student();
//    	student.setId(3);
//    	student.setName("hggj");
//    	student.setAge(25);
    	
    	
    	boolean check=true;
    	System.out.println("CRUD operation");
    	while(check) {
    	System.out.println("Enter 1 to add employee");
    	System.out.println("Enter 2 to update employee");
    	System.out.println("Enter 3 to fetch employee");
    	System.out.println("Enter 4 to delete employee");

    	int input=sc.nextInt();
    	switch(input){
    		case 1:
    			System.out.println("Enter emp name");
    			student.setName(sc.next());
    			System.out.println("Enter emp salary");
    			student.setAge(sc.nextInt());
    	    	dao.insertStudent(student);
    			break;
    		case 2:
    			System.out.println("enter the id to update");
    			student.setId(sc.nextInt());
    			System.out.println("Enter emp name");
    			student.setName(sc.next());
    			
    	    	dao.updateStudent(student);
    			break;
    			
    		case 3:
    	    	dao.fetchStudent();
    			break;
    		case 4:
    			System.out.println("enter the id to delete");

    	    	dao.deleteStudent(sc.nextInt());
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
