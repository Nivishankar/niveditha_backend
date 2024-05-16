package manyTomanymapping;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nisu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Book2> books = new ArrayList<>();
		List<Student2> students = new ArrayList<>();
		
		Book2 b1 = new Book2();
		Book2 b2 = new Book2();
		Book2 b3 = new Book2();
		
		Student2 st1 = new Student2();
		Student2 st2 = new Student2();
		Student2 st3 = new Student2();
		
		b1.setTitle("One day life will change");
		b1.setStudents(students);
		
		b2.setTitle("you are my best friend");
		b2.setStudents(students);
		
		b3.setTitle("cosmos");
		b3.setStudents(students);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);

		st1.setName("Gavin");
		st1.setAge(32);
		st1.setBooks(books)
;
		
		st2.setName("Oliver");
		st2.setAge(30);
		st2.setBooks(books)
;
		
		st3.setName("Rohan");
		st3.setAge(23);
		st3.setBooks(books)
;
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		
		
		transaction.begin();
		manager.persist(st1);
		manager.persist(st2);
		manager.persist(st3);
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);

		transaction.commit();
		
		manager.close();
	}
}
