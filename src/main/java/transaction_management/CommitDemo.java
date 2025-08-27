package transaction_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitDemo {
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
						
			
			con.setAutoCommit(false); // dissabiling the auto commit feature
			
			Statement stm = con.createStatement();
			
			
			String query = "insert into employee values(14,'Rahul', 3000, 9898678768, '2024-01-01')";
			
			System.out.println(stm.executeUpdate(query));
			
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
