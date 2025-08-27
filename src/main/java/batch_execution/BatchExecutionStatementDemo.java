package batch_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecutionStatementDemo {
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
						
			
			
			// Step 3 : Statement 
			
			Statement stm = con.createStatement();
			
			
			String query1 = "insert into employee values(13, 'Raj', 4000, 898768789, '2020-05-05')" ;
			String query2 = "update employee set salary = 1700 where id = 1";
			String query3 = "delete from employee where id = 11";
			
			stm.addBatch(query1);
			stm.addBatch(query2);
			stm.addBatch(query3);
			
			
			int[] result = stm.executeBatch();
			
			for(int r : result ) {
				System.out.println(r);
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
