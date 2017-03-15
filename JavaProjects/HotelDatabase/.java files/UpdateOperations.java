import java.sql.Connection;
import java.sql.PreparedStatement;


public class UpdateOperations {
	public void updateStatementForEmployeeSalary(int newSalary , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Employee SET Salary = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setInt(1, newSalary);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void updateStatementForEmployeeFName(String FName , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Employee SET FName = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, FName);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void updateStatementForEmployeeMName(String MName , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Employee SET MName = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, MName);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void updateStatementForEmployeeLName(String LName , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Employee SET LName = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, LName);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	
	public void updateStatementForEmployeeDepartment(String Dnumber , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Employee SET Department_Number = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Dnumber);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	
	public void updateStatementForEmployeeSupervisor(String Super_ID , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Employee SET Super_ID = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Super_ID);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	//.........................................................................Update Employee^.............................................................
	
	public void updateStatementForGuestFName(String Fname , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Guest SET FName = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Fname);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	
	public void updateStatementForGuestMName(String Mname , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Guest SET MName = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Mname);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void updateStatementForGuestLName(String Lname , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Guest SET LName = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Lname);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void updateStatementForGuestEmail(String Email , String ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Guest SET Email = ? " 
	        + " WHERE ID = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Email);
	      preparedStmt.setString(2, ID);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	//.........................................................................Update Guest^.............................................................	
	
	public void updateStatementForDepartmentNum(String Dname , String D_Num ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE department SET Name = ? " 
	        + " WHERE Department_Number = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Dname);
	      preparedStmt.setString(2, D_Num);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	
	
	public void updateStatementForDepartmentMananger(String Mgr_ID , String D_Num ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE department SET Manager_ID = ? " 
	        + " WHERE Department_Number = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Mgr_ID);
	      preparedStmt.setString(2, D_Num);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	//.........................................................................UpdateDepartment^.............................................................	
	
	public void updateStatementForReservationStartDate(String Start_Date , String Reservation_Number ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Reservation SET Start_Date = ? " 
	        + " WHERE Reservation_Number = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Start_Date);
	      preparedStmt.setString(2, Reservation_Number);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void updateStatementForReservationEndDate(String End_Date , String Reservation_Number ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Reservation SET End_Date = ? " 
	        + " WHERE Reservation_Number = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, End_Date);
	      preparedStmt.setString(2, Reservation_Number);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	//.........................................................................UpdateDepartment^.............................................................
	public void updateStatementForRoomPrice(int Price , String Room_num ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Room SET Price = ? " 
	        + " WHERE Room_Number = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setInt(1, Price);
	      preparedStmt.setString(2, Room_num);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	public void updateStatementForRoomAvailabilty(boolean availablity, String Room_num ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "UPDATE Room SET availability = ? " 
	        + " WHERE Room_Number = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setBoolean(1, availablity);
	      preparedStmt.setString(2, Room_num);	      		   
	      // execute the prepar edstatement
	      preparedStmt.executeUpdate();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
}
