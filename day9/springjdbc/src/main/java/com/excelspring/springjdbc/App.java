package com.excelspring.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excelspring.springjdbc.dao.StudentDao;
import com.excelspring.springjdbc.entity.Student;

public class App {
	
	
	public static void main( String[] args )
    {
    	ApplicationContext context= new AnnotationConfigApplicationContext(Jdbcconfiguration.class);
 
    	StudentDao dao=context.getBean("studentDao",StudentDao.class);
    	
    	Student student=new Student();
    	student.setId(3);
    	student.setName("hggj");
    	student.setAge(25);
    	
//    	dao.insertStudent(student);
//    	dao.updateStudent(student);
//    	dao.deleteStudent(4);
    	dao.fetchStudent();
    	
    }
}
