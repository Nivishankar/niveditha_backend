package collectionTopics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Employee> employees=new LinkedList<>();
		while(true) {
			Employee emp=new Employee();
			System.out.println("Enter id");
			int id=sc.nextInt();
			emp.setId(id);
			System.out.println("Enter name");
			String name=sc.next();
			emp.setName(name);
			System.out.println("Enter salary");
			int salary=sc.nextInt();
			emp.setSalary(salary);
			employees.add(emp);

			System.out.println("Need to add more employees");
			String cond=sc.next();
			if(!"yes".equalsIgnoreCase(cond))
				break;

		}
		//Comparable
//		Collections.sort(employees);
		
		//Comparator
		
//		Collections.sort(employees, (e1,e2)->e1.getId()-e2.getId());
		Collections.sort(employees, (e1,e2)->e2.getSalary()-e1.getSalary());
//		Collections.sort(employees, (e1,e2)->e1.getName()-e2.getName());

		
//		employees.sort((e1,e2)->e1.getId().compareTo(e2.getId()));
		
		for(Employee e:employees) {
			System.out.println(e);
		
		}
		
	}
}
