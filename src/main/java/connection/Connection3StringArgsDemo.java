package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection3StringArgsDemo {
	public static void main(String[] args) {

		try {
			
			// Step 1 : Load the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded successfully ...!");
			
			// Step 2 : Connection - 3 String Arguments
			
			
			/*
				String url = "jdbc:mysql://localhost:3306/practice";
				String user = "root";
				String password = "---";
			*/
			
			String url = "jdbc:postgresql://localhost:5432/practice";
			String user = "postgres";
			String password = "root";
			
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("Connecction done successfully ...!");
						
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}
}	
