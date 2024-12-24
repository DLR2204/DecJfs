package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading Driver Classes
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

//		(2)Create the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","task","task");
		
//		(3)Create the statements
		
		Statement stmt = conn.createStatement();
		
//		(4)Execute the statements
		
		stmt.execute("create table product(pid number,pname varchar2(10),price number)");
		
//		(5)Close the connections.
		
		conn.close();
		
		System.out.println("Table is created successfully");
		
	}

}
