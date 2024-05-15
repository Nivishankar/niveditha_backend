package com.excelsoft.excelhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class MainOneToOne {
	public static void main(String[] args) {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("stddb");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	MarksCard card=new MarksCard();
	card.setSub("maths");
	
	Student std=new Student();
	std.setName("abc");
	std.setAge(20);
	std.setMarks(card);
	
	transaction.begin();
	manager.persist(std);
	transaction.commit();
	manager.close();
	}
}
