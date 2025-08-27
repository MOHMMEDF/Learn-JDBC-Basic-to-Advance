package transaction_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavepointDemo {
	public static void main(String[] args) {
		
try {
			
			// Step 1 : Load the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded successfully ...!");
			
			// Step 2 : Connection - 3 String Arguments
			
		
			String url = "jdbc:postgresql://localhost:5432/practice";
			String user = "postgres";
			String password = "root";
			
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("Connecction done successfully ...!");
					
			con.setAutoCommit(false);
			
			
			// Step 3 : Statement
			
			Statement stm = con.createStatement();
			
			
			String query1 = "insert into employee values (15, 'Jai', 500, 8987687890, '2025-02-02')";
			String query2 = "insert into employee values (16, 'Ronaldo', 600, 8987687890, '2024-02-02')";
			String query3 = "insert into employee values (17, 'Messi', 700, 8987687890, '2023-02-02')";
			
			
			stm.executeUpdate(query1);
			
			Savepoint sp = con.setSavepoint();
			
			stm.executeUpdate(query2);
			stm.executeUpdate(query3);
			
			
			con.rollback(sp);
			
			con.commit();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
