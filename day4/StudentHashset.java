package collectionTopics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class StudentHashset {
	
	int id;
	String name;
	int age;

	public StudentHashset(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	

	@Override
	public int hashCode() {
		return this.id;
	}




	@Override
	public boolean equals(Object obj) {
		StudentHashset shs=(StudentHashset) obj;
		return this.name==shs.name && this.age==shs.age && this.hashCode()==shs.hashCode();
		
	}




	@Override
	public String toString() {
		return "StudentHashset [id=" + id + ", name=" + name + ", age=" + age + "]";
	}




	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<StudentHashset> hs=new HashSet<>();
		while(true){
			System.out.println("Enter std id");
			int id=sc.nextInt();
			System.out.println("Enter std name");
			String name=sc.next();
			System.out.println("Enter std age");
			int age=sc.nextInt();
			System.out.println("Need to add more students(y/n)");
			String st=sc.next();
			hs.add(new StudentHashset(id,name,age));
			if(st.equalsIgnoreCase("n")) {
				break;
			}
		}
		sc.close();
		
		Iterator hitr=hs.iterator();
		while(hitr.hasNext()) {
			System.out.println(hitr.next());
		}
		
			}




	
}
