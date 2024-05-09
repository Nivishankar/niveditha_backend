package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String pwd="Sa123";
		Connection conn=DriverManager.getConnection(url,user,pwd);
//		String query="insert into student(name,age,address) values('abc',23,'bangalore')";
//		Statement stat=conn.createStatement();
//		stat.execute(query);
		
		
		
		PreparedStatement preparedStatement=conn.prepareStatement("insert into student(name,age,address) values(?,?,?)");
		System.out.println("Enter name:");
		preparedStatement.setString(1,sc.next());
		System.out.println("Enter age:");
		preparedStatement.setInt(2, sc.nextInt());
		System.out.println("Enter addresss:");
		preparedStatement.setString(3, sc.next());
		
		preparedStatement.execute();
//		conn.setAutoCommit(true);
//		conn.commit();
//		conn.rollback();
		conn.close();
		
	}
}
