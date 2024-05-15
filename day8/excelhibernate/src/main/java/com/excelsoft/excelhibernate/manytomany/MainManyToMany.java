package com.excelsoft.excelhibernate.manytomany;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainManyToMany {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stddb");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Book2> books = new ArrayList<>();
		List<Student2> students = new ArrayList<>();
		
		Book2 b1 = new Book2();
		Book2 b2 = new Book2();
		Book2 b3 = new Book2();
		
		Student2 std1 = new Student2();
		Student2 std2 = new Student2();
		Student2 std3 = new Student2();
		
		b1.setBk_title("One day life will change");
		b1.setStudents(students);
		
		b2.setBk_title("you are my best friend");
		b2.setStudents(students);
		
		b3.setBk_title("cosmos");
		b3.setStudents(students);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);

		std1.setName("John");
		std1.setAge(32);
		std1.setBooks(books);
		
		std2.setName("Oliver");
		std2.setAge(30);
		std2.setBooks(books);
		
		std3.setName("Rohan");
		std3.setAge(23);
		std3.setBooks(books);
		
		students.add(std1);
		students.add(std2);
		students.add(std3);
		
		
		transaction.begin();
		manager.persist(students);
		manager.persist(books);

		transaction.commit();
		
		manager.close();
	}
}
