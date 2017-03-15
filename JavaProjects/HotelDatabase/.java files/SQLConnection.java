import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLConnection {
	
	 	 private static String DB_URL = "jdbc:mysql://localhost/aseel?autoReconnect=true&useSSL=false";    
	     private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 //  Database credentials
	     private static String USER = "root";   
	     private static String PASS = "1234567890";
	     private static Connection conn;
	     private static String urlstring;
	     
	     
	     public static Connection getConnection() {
	         try {
	             Class.forName(JDBC_DRIVER);
	             try {
	                 conn = DriverManager.getConnection(DB_URL, USER, PASS);
	             } catch (SQLException ex) {
	                 // log an exception. from example:
	                 System.out.println("Failed to create the database connection."); 
	             }
	         } catch (ClassNotFoundException ex) {
	             // log an exception. for example:
	             System.out.println("Driver not found."); 
	         }
	         return conn;
	     }
	 }
	
	
	
	
	
	

