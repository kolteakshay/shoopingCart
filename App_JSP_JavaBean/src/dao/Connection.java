package dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	
	private static Connection connection;
	
	static{
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jeegeti","root","root");
		}catch(ClassNotFoundException e){ 
			
			
		}catch(SQLException e){ 
			
			
		}
		
		
	}

	public static Connection getConnection() {
		return connection;
	}

	

}
