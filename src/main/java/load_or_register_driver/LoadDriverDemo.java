package load_or_register_driver;

public class LoadDriverDemo {
	public static void main(String[] args) {
		
		
		// Step 1 : Load the Driver
		
//		try {
//			Class.forName("org.postgresql.Driver");
//			
//			System.out.println("Driver Loaded ....!");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Mysql Driver Loaded ...");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
	
		
		
		
		
	}
}
