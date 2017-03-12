import java.sql.Connection;
import java.sql.PreparedStatement;


public class DeleteOperations {
	
	public void DeleteEmployee( String E_ID ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = " delete from Employee where ID = ? ";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, E_ID);	      		   
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
	
	public void DeleteReservation( String reservation_num ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "delete from Reservation where Reservation_Number = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, reservation_num);	      		   
	      // execute the prepar edstatement
	      preparedStmt.execute();
	      preparedStmt.close();
	      
	      conn.close();
		
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void DeleteDepartment( String Dept_num ){
		try{
		Connection conn = SQLConnection.getConnection();
		 // the mysql insert statement
		
	      String query = "delete from Department where Department_Number = ?";
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      
	      preparedStmt.setString(1, Dept_num);	      		   
	      // execute the prepar edstatement
	      preparedStmt.execute();
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
