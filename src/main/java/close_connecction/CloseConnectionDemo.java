package close_connecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseConnectionDemo {
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			
			// Step 1 : Load the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded successfully ...!");
			
			// Step 2 : Connection - 3 String Arguments
			
			
		
			
			String url = "jdbc:postgresql://localhost:5432/practice";
			String user = "postgres";
			String password = "root";
			
			
			 con = DriverManager.getConnection(url, user, password);
			
			System.out.println("Connecction done successfully ...!");
				
			

			
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				con.close();
				
				System.out.println("Connecction closed ");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
