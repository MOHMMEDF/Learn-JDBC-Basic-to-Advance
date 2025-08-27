package load_or_register_driver;

import java.sql.DriverManager;

import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



//import org.postgresql.Driver;

public class RegisterDriverDemo {
	public static void main(String[] args) {
		
		//Driver d = new Driver();
		
		
//			try {
//				DriverManager.registerDriver(d);
//				System.out.println("Driver Registered ....!");
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//	
	
		
		
		
		try {
			Driver d = new Driver();
			
			DriverManager.registerDriver(d);
			
			System.out.println("Driver Registered...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		
		

		
		
	}
}
