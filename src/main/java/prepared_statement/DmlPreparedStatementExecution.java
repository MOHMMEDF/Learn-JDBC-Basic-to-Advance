package prepared_statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DmlPreparedStatementExecution {
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
						
			
			String query = "insert into employee values(?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the id :");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the name ");
			String name = sc.nextLine();
			
			
			System.out.println("Enter the salary :");
			double sal = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Enter the phone :");
			long phone = sc.nextLong();
			sc.nextLine();
			
			
			System.out.println("Enter the date :");
			String date = sc.nextLine();
			
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, sal);
			ps.setLong(4, phone);
			ps.setDate(5, Date.valueOf(date));
			
			
			/*
			boolean result = ps.execute();
			
			System.out.println(result);
			
			*/
			
			int result = ps.executeUpdate();
			if(result > 0) {
				System.out.println("Success");
			}
			else {
				
				System.out.println("Failed");
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
