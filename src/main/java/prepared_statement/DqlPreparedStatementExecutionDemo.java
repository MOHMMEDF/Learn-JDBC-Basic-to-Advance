package prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DqlPreparedStatementExecutionDemo {
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
						
			
			// Step 3 : Dql Execution using Prepared Statement
			
			String query = "select * from employee where id = ?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the id :");
			int id = sc.nextInt();
			sc.nextLine();
			
			
			ps.setInt(1, id);
			
			
			/*
			// 1st way is using execute() & getResultSet()
			
			boolean result = ps.execute();
			
			System.out.println("result " + result);
			
			
			ResultSet rs = ps.getResultSet();
			
			
			rs.next();
			
			System.out.println(rs.getInt(1) + ", "+  rs.getString("name"));
			
			*/
			
			// 2nd way is using executeQuery()
			
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			
			System.out.println(rs.getInt(1) + ", "+  rs.getString("name"));
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
