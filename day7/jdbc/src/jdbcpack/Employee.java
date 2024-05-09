package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {
	
	private static Connection connection;
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee emp=new Employee();
		boolean input=true;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String pwd="Sa123";
		connection=DriverManager.getConnection(url, user, pwd);
		while(input) {
		System.out.println("Please select any one crud operation");
		System.out.println("Enter 1 for insert employee");
		System.out.println("Enter 2 for select employee by id");
		System.out.println("Enter 3 for select all employee");
		System.out.println("Enter 4 for update employee fields");
		System.out.println("Enter 5 for delete employee");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			emp.insertEmployee();
			break;
		case 2:
			emp.selectOneEmployee();
			break;
		case 3:
			emp.selectAllEmployee();
			break;
		case 4:
			emp.updateEmployee();
			break;
		case 5:
			emp.deleteEmployee();
			break;
		default:
			System.out.println("Invalid operation ! please enter valid number");
			break;
		}
		System.out.println("you want to perform other operations?(y/n)");
		input="y".equalsIgnoreCase(sc.next());
		}	
		connection.close();
	}
	
	
	
	
	
	public void insertEmployee() throws SQLException {
		String query="insert into employee(name,salary,deptName) values(?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		System.out.println("Enter employee name:");
		preparedStatement.setString(1,sc.next());
		System.out.println("Enter employee salary:");
		preparedStatement.setInt(2, sc.nextInt());
		System.out.println("Enter employee deptName:");
		preparedStatement.setString(3, sc.next());
		preparedStatement.execute();
		System.out.println("Employee details inserted successfully");
	}
	
	public void selectOneEmployee() throws SQLException {
		System.out.println("Enter the employee id to fetch the records:");
		String query="select * from employee where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1,sc.nextInt());
		ResultSet resultset=preparedStatement.executeQuery();
		if(resultset.next()) {
			System.out.println("[id:"+resultset.getInt("id")+" name:"+resultset.getString(2)+" salary:"+resultset.getInt(3)+" detpName:"+resultset.getString(4)+"]");
		}else {
			System.out.println("Employee record not found");
		}
	}
	
	public void selectAllEmployee() throws SQLException {
		String query="select * from employee";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next()) {
			System.out.println("[id:"+resultset.getInt("id")+" name:"+resultset.getString(2)+" salary:"+resultset.getInt(3)+" detpName:"+resultset.getString(4)+"]");
		}

	}
	
	public void updateEmployee() throws SQLException {
		System.out.println("Enter the employee id to update the record:");
		int id=sc.nextInt();
		
		//update all the records at a time
		
//		String query=("update employee set name=?,salary=?,deptName=? where id="+id);
//		PreparedStatement preparedStatement=connection.prepareStatement(query);
//		System.out.println("Enter employee name:");
//		preparedStatement.setString(1, sc.next());
//		System.out.println("Enter employee salary:");
//		preparedStatement.setInt(2, sc.nextInt());
//		System.out.println("Enter employee deptName:");
//		preparedStatement.setString(3, sc.next());
//		
		
		//update particular column
		String updateQuery="update employee set";
		System.out.println("If you want to update by name / salary / deptName :");
		String input=sc.next();
		PreparedStatement preparedStatement=connection.prepareStatement(updateQuery+" "+input+"=? where id="+id);
		switch(input){
			case "name":
				System.out.println("Enter employee name:");
				preparedStatement.setString(1, sc.next());
				break;
			case "salary":
				System.out.println("Enter employee salary:");
				preparedStatement.setInt(1, sc.nextInt());
				break;
			case "deptName":
				System.out.println("Enter employee name:");
				preparedStatement.setString(1, sc.next());
				break;
		}
		int record=preparedStatement.executeUpdate();
		if(record!=0) {
			System.out.println("Records updated successfully");
		}else {
			System.out.println("Records not updated");
		}

	}
	
	public void deleteEmployee() throws SQLException {
		System.out.println("Enter the employee id to delete the record:");
		int id=sc.nextInt();
		String query=("delete from employee where id="+id);
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.execute();
		System.out.println("Records deletd successfully");
		
	}
}
