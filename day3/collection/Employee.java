package collectionTopics;

public class Employee implements Comparable<Employee>{
	private Integer id;
	private String name;
	private Integer salary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	
	@Override
	public int compareTo(Employee e) {
//		return this.id.compareTo(e.id);
//		return this.salary.compareTo(e.salary);
		return this.name.compareTo(e.name);



	}
	

	

}
