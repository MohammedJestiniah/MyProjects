import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;


public class InsertionOperations {
		public void insertionStatementForEmployees(String ID , int Salary ,String Fname ,String Mname,String Lname,String Dep_Num,String Super_ID ){
			try{
				 
				
			Connection conn = SQLConnection.getConnection();
			 // the mysql insert statement
		      String query = " insert into Employee (ID, Salary, FName, MName,LName,Department_Number,Super_ID)"
		        + " values (?, ?, ?, ?, ?, ?, ?)";
		      String query2 = "insert into Employee_Phone (E_ID , Phone)"
				        + " values (?, ?)";
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
		      preparedStmt.setString(1, ID);
		      preparedStmt.setInt(2, Salary);
		      preparedStmt.setString(3, Fname);
		      preparedStmt.setString(4, Mname);
		      preparedStmt.setString(5, Lname);
		      preparedStmt.setString(6, Dep_Num);
		      preparedStmt.setString(7, Super_ID);

		      // execute the prepar edstatement
		      preparedStmt.execute();
		     /* 
		      for(int i = 0 ; i<Phone.length ; i++){
			      preparedStmt2.setString(1, ID);
			      preparedStmt2.setString(2, Phone[i]);
			      preparedStmt2.addBatch();
			      preparedStmt2.executeBatch();
			      
			      }
		      */
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
		}
		
		public void insertionStatementForGuests(String ID ,String Fname ,String Mname,String Lname,String Email, String[] Phone  ){
			try{
			Connection conn = SQLConnection.getConnection();
			 // the mysql insert statement
			
		      String query = "insert into Guest (ID,  FName, MName,LName,	Email)"
		        + " values (?, ?, ?, ?, ?)";
		      String query2 = "insert into Guest_Phone (Guest_ID , Phone)"
				        + " values (?, ?)";

		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
		      preparedStmt.setString(1, ID);
		      preparedStmt.setString(2, Fname);
		      preparedStmt.setString(3, Mname);
		      preparedStmt.setString(4, Lname);
		      preparedStmt.setString(5, Email);
		      // execute the prepar edstatement
		      preparedStmt.execute();
		     
		      
		      for(int i = 0 ; i<Phone.length ; i++){
		      preparedStmt2.setString(1, ID);
		      preparedStmt2.setString(2, Phone[i]);
		      preparedStmt2.addBatch();
		      preparedStmt2.executeBatch();
		      
		      }
		      
		      conn.close();
			
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
		}
		
		public void insertionStatementForDepartments(String ID ,String Dname ,String Mng_ID){
			try{
			Connection conn = SQLConnection.getConnection();
			 // the mysql insert statement
			
		      String query = "insert into Department (Department_Number,Name, Manager_ID)"
		        + " values (?, ?, ?)";
		      

		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      
		      preparedStmt.setString(1, ID);
		      preparedStmt.setString(2, Dname);
		      preparedStmt.setString(3, Mng_ID);		   
		      // execute the prepar edstatement
		      preparedStmt.execute();
		     
		      
		      
		      conn.close();
			
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
		}
		
		public void insertionStatementForReservation(String ReservationNum ,String StartDate ,String EndDate,String GuestID){
			try{
				
			Connection conn = SQLConnection.getConnection();
			 // the mysql insert statement
			
		      String query = "insert into reservation (Reservation_Number, Start_Date, End_Date, Guest_ID )"
		        + " values (?, ?, ?,?)";
		      
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      
		      preparedStmt.setString(1, ReservationNum);
		      preparedStmt.setString(2, StartDate);
		      preparedStmt.setString(3, EndDate);
		      preparedStmt.setString(4, GuestID);
		      // execute the prepar edstatement
		      preparedStmt.execute();
   
		      conn.close();
			
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
		}
		
		
		public void insertionStatementForHasRoom(String ReservationNum ,String RoomID){
			try{
			Connection conn = SQLConnection.getConnection();
			 // the mysql insert statement
			
		      String query = "insert into has_room (Reservation_Number, Room_Number )"
		        + " values (?, ?)";
		      
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      
		      preparedStmt.setString(1, ReservationNum);
		      preparedStmt.setString(2, RoomID);	   
		      // execute the prepar edstatement
		      preparedStmt.execute();
		     
		      
		      
		      conn.close();
			
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
		}
		
		
		public void insertionStatementForReserve(String Guest_ID,String E_ID,String Reserve_Number){
			try{
			Connection conn = SQLConnection.getConnection();
			 // the mysql insert statement
			
		      String query = "insert into reserve (Guest_ID, E_ID, Reserve_Number )"
		        + " values (?, ?, ?)";
		      
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      
		      preparedStmt.setString(1, Guest_ID);
		      preparedStmt.setString(2, E_ID);	
		      preparedStmt.setString(3, Reserve_Number);
		      // execute the prepar edstatement
		      preparedStmt.execute();

		      conn.close();
			
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
		}
		
		
		public void insertionStatementForProvideService(String Department_Number ,String RoomNum ){
			try{
			Connection conn = SQLConnection.getConnection();
			 // the mysql insert statement
			
		      String query = "insert into provide_service (Department_Number,Room_Number)"
		        + " values (?, ?)";
		      

		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      
		      preparedStmt.setString(1, Department_Number);
		      preparedStmt.setString(2, RoomNum);		   
		      // execute the prepar edstatement
		      preparedStmt.execute();
		      
		      
		      
		      conn.close();
			
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
		}
		
		public String createReservationNum(String GuestID){
			
			 char[] CHARSET_AZ_09 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();                  
			   Random random = new SecureRandom();
			    char[] result = new char[4];
			    for (int i = 0; i < result.length; i++) {
			        // picks a random index out of character set > random character
			        int randomCharIndex = random.nextInt(CHARSET_AZ_09.length);
			        result[i] = CHARSET_AZ_09[randomCharIndex];
			       
			    }
			    String reservation = new String(result);
				reservation =reservation+ GuestID.substring(4, 5)+GuestID.substring(9, 10) ;
			   return reservation;
			
			
		}
		
}
