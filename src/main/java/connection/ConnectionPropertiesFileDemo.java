package connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionPropertiesFileDemo {
	public static void main(String[] args) {
		

		
		try {
			// Step 1 : Load the Driver 
			Class.forName("org.postgresql.Driver");
			
			System.out.println("Driver Loaded successfully ....!");
			
			// Step 2 : Connection using Properties file
			FileInputStream fis = new FileInputStream("C:\\Users\\kadam\\OneDrive\\Desktop\\My Adv Java\\Batch\\E21\\Adv Java code\\JDBC\\jdbc_demo\\src\\main\\resources\\data.properties");
			
			Properties property = new Properties();
			
			property.load(fis);
			
			String url = property.getProperty("url");
			
			Connection con = DriverManager.getConnection(url, property);
			
			System.out.println("Connection done successfully ...!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
