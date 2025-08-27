package transaction_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RollBackDemo {
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
			
			
			String query1 = "delete from employee where id = 1";
			String query2 = "delete from employee where id = 2";
			String query3 = "delete from employee where id = 3";
			
			
			int r1 = stm.executeUpdate(query1);
			int r2 =stm.executeUpdate(query2);
			int r3 = stm.executeUpdate(query3);
			
			if(r1 > 0 && r2 > 0 && r3 > 0) {
				System.out.println("Query Committed successfully");
				con.commit();
			}
			else {
				System.out.println("Queries rolledback");
				con.rollback();
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
