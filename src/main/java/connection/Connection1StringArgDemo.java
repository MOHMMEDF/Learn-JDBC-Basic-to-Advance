package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1StringArgDemo {
	public static void main(String[] args) {
		
		// Step 1 : Load the Driver
					try {
						Class.forName("org.postgresql.Driver");
						System.out.println("Driver Loaded successfully ...!");
						
						
						String url = "jdbc:postgresql://localhost:5432/practice?user=postgres&password=root";
						
						
						Connection con = DriverManager.getConnection(url);
						System.out.println("Connection Done Successfully ...!");
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
		
		
	}
}
