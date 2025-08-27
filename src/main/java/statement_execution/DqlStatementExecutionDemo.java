package statement_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DqlStatementExecutionDemo {
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
			
			
			// Step 3 : Creating the statement object
			
			Statement stm = con.createStatement();
			
			
			// Dql query 
			String query = "select * from employee";
			
			/*
			
			boolean result = stm.execute(query); // true
			
			
			ResultSet rs = stm.getResultSet();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + ", "  + rs.getString(2) + ", " + rs.getDouble(3) + ", " + rs.getLong(4) + ", " + rs.getString(5));
				
				
			}
			
			*/
			
			
			
			// Dql Execution - executeQuery()
			
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + ", "  + rs.getString("name") + ", " + rs.getDouble("salary") + ", " + rs.getLong("phone") + ", " + rs.getString("doj"));
				
				
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
