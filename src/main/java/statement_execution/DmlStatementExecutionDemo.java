package statement_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlStatementExecutionDemo {
	public static void main(String[] args) {
		try {
			
			// Step 1 : Load the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded successfully ...!");
			
			
			String url = "jdbc:postgresql://localhost:5432/practice";
			String user = "postgres";
			String password = "root";
			
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("Connecction done successfully ...!");
						
			
			// Step 3 : create the Statement object 
			Statement stm = con.createStatement();
			
		
			/*	using execute() method 
			String insertQuery = "insert into employee values(9,'Tarun', 55000, 9898786789, '2024-01-01')";
			
			
			boolean result = stm.execute(insertQuery);
			
			System.out.println(result);
			
			*/
			
			
			String insertQuery = "insert into employee values(10,'Naga Arjuna', 60000, 9898786789, '2023-01-01')";
			
			int result = stm.executeUpdate(insertQuery);
			
			if(result > 0) {
				
				System.out.println("Query executed successfully");
				
			}
			else {
				System.out.println("Failed to execute the query");
				
			}
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
