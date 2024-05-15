package com.excelsoft.excelhibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainOneToMany {

public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stddb");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Laptop1> laptops = new ArrayList<>();
		Laptop1 laptop1 = new Laptop1();
		Laptop1 laptop2 = new Laptop1();
		Laptop1 laptop3 = new Laptop1();
		
		Student1 std1 = new Student1();
		
		laptop1.setLap_brand("Dell");
		laptop1.setLap_no("bzxnnboq12");
		laptop1.setStudent(std1);
		
		laptop2.setLap_brand("hp");
		laptop2.setLap_no("lkkukuiuks23");
		laptop2.setStudent(std1);
		
		laptop3.setLap_brand("lenovo");
		laptop3.setLap_no("qwewerdtaa45");
		laptop3.setStudent(std1);
		
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		
		std1.setAge(21);
		std1.setName("John");
		std1.setLaptops(laptops);
		
		transaction.begin();
		manager.persist(std1);
		transaction.commit();
		
		manager.close();
	}
}
