import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class retrieveOperations {
	
	public static ArrayList<Room> rooms = new ArrayList<Room>();
	public static ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	public static ArrayList<Guest> guests = new ArrayList<Guest>();
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static ArrayList<Guest_Phone> guest_Phones = new ArrayList<Guest_Phone>();
	public static ArrayList<Parking> parkings = new ArrayList<Parking>();
	public static ArrayList<Department> departments = new ArrayList<Department>();
	public static ArrayList<Provide_Service> services = new ArrayList<Provide_Service>();
	public static ArrayList<Report> reports = new ArrayList<Report>();
	public static ArrayList<Revenue> revenues = new ArrayList<Revenue>();
	
	//Receptionist retrieve operations
	
	//********************************************************************************************************************************************
	//Room
	public void retrieveStatementForRoom(){
		
		rooms.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select r.room_number, r.Floor, r.Price, r.max_Guest, r.Availability, r.Room_type, rt.Type_Name from room r join room_type rt on(rt.Type_Number = r.Room_type) where r.Availability is true; ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		          String Room_Number  = rs.getString("Room_Number");
		          String Floor = rs.getString("Floor");
		          int price  = rs.getInt("Price");
		          int Max_Guest  = rs.getInt("Max_guest");
		          boolean Availability = rs.getBoolean("Availability");
		          String Room_type = rs.getString("Room_type");
		          String Room_typeName = rs.getString("rt.Type_Name");

		          //Display values
		          /*System.out.print("Room_Number: " + Room_Number);
		          System.out.print(", Floor: " + Floor);
		          System.out.print(", price: " + price);
		          System.out.print(", Max_Guest: " + Max_Guest);
		          System.out.print(", Availability: " + Availability);
		          System.out.print(", Room_type: " + Room_type);
		          System.out.println(", Room_typeName: " + Room_typeName);*/
		          
		          Room dummy = new Room(Room_Number, Floor, price, Max_Guest, Availability, Room_type, Room_typeName);
		          rooms.add(dummy);
		          
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForAvailableRoomByFloor(String floor){
		
		rooms.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select r.room_number, r.Floor, r.Price, r.max_Guest, r.Availability, r.Room_type, rt.Type_Name from room r join room_type rt on(rt.Type_Number = r.Room_type) where Floor = \""+floor+"\" and  Availability is true ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Room_Number  = rs.getString("Room_Number");
		          String Floor = rs.getString("Floor");
		          int price  = rs.getInt("Price");
		          int Max_Guest  = rs.getInt("Max_guest");
		          boolean Availability = rs.getBoolean("Availability");
		          String Room_type = rs.getString("Room_type");
		          String Room_typeName = rs.getString("rt.Type_Name");

		          //Display values
		          /*System.out.print("Room_Number: " + Room_Number);
		          System.out.print(", Floor: " + Floor);
		          System.out.print(", price: " + price);
		          System.out.print(", Max_Guest: " + Max_Guest);
		          System.out.print(", Availability: " + Availability);
		          System.out.print(", Room_type: " + Room_type);
		          System.out.println(", Room_typeName: " + Room_typeName);
		          */
		          Room dummy = new Room(Room_Number, Floor, price, Max_Guest, Availability, Room_type, Room_typeName);
		          rooms.add(dummy);
		          
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForAvailableRoomByRoomType(String type){
	
		rooms.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select r.room_number, r.Floor, r.Price, r.max_Guest, r.Availability, r.Room_type, rt.Type_Name from room r join room_type rt on(rt.Type_Number = r.Room_type) where Room_type = \""+type+"\" and  Availability is true ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Room_Number  = rs.getString("Room_Number");
		          String Floor = rs.getString("Floor");
		          int price  = rs.getInt("Price");
		          int Max_Guest  = rs.getInt("Max_guest");
		          boolean Availability = rs.getBoolean("Availability");
		          String Room_type = rs.getString("Room_type");
		          String Room_typeName = rs.getString("rt.Type_Name");

		          //Display values
		          /*System.out.print("Room_Number: " + Room_Number);
		          System.out.print(", Floor: " + Floor);
		          System.out.print(", price: " + price);
		          System.out.print(", Max_Guest: " + Max_Guest);
		          System.out.print(", Availability: " + Availability);
		          System.out.print(", Room_type: " + Room_type);
		          System.out.println(", Room_typeName: " + Room_typeName);
		          */
		          Room dummy = new Room(Room_Number, Floor, price, Max_Guest, Availability, Room_type, Room_typeName);
		          rooms.add(dummy);
		          
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForAvailableRoomByPrice(String operation, int room_price){
	
		rooms.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = "select r.room_number, r.Floor, r.Price, r.max_Guest, r.Availability, r.Room_type, rt.Type_Name from room r join room_type rt on(rt.Type_Number = r.Room_type) where Price "+operation +" "+room_price+" and  Availability is true ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Room_Number  = rs.getString("Room_Number");
		          String Floor = rs.getString("Floor");
		          int price  = rs.getInt("Price");
		          int Max_Guest  = rs.getInt("Max_guest");
		          boolean Availability = rs.getBoolean("Availability");
		          String Room_type = rs.getString("Room_type");
		          String Room_typeName = rs.getString("rt.Type_Name");

		          //Display values
		          /*System.out.print("Room_Number: " + Room_Number);
		          System.out.print(", Floor: " + Floor);
		          System.out.print(", price: " + price);
		          System.out.print(", Max_Guest: " + Max_Guest);
		          System.out.print(", Availability: " + Availability);
		          System.out.print(", Room_type: " + Room_type);
		          System.out.println(", Room_typeName: " + Room_typeName);
		          */
		          Room dummy = new Room(Room_Number, Floor, price, Max_Guest, Availability, Room_type, Room_typeName);
		          rooms.add(dummy);
		          
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForAvailableRoomOnDate(String startDate, String endDate, String roomType){
		
		rooms.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " SELECT * FROM room r join room_type rt on (r.Room_type = rt.Type_Number)WHERE r.Room_Number NOT IN(SELECT hr.Room_Number FROM reservation rs,has_room hr WHERE '"+startDate+"' <= rs.Start_Date AND '"+endDate+"' >= rs.End_Date) and Room_type =" + roomType;
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Room_Number  = rs.getString("Room_Number");
		          String Floor = rs.getString("Floor");
		          int price  = rs.getInt("Price");
		          int Max_Guest  = rs.getInt("Max_guest");
		          boolean Availability = rs.getBoolean("Availability");
		          String Room_type = rs.getString("Room_type");
		          String Room_typeName = rs.getString("rt.Type_Name");

		          //Display values
		          /*System.out.print("Room_Number: " + Room_Number);
		          System.out.print(", Floor: " + Floor);
		          System.out.print(", price: " + price);
		          System.out.print(", Max_Guest: " + Max_Guest);
		          System.out.print(", Availability: " + Availability);
		          System.out.print(", Room_type: " + Room_type);
		          System.out.println(", Room_typeName: " + Room_typeName);
		          */
		          Room dummy = new Room(Room_Number, Floor, price, Max_Guest, Availability, Room_type, Room_typeName);
		          rooms.add(dummy);
		          
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForAvailableRoomByRoomNumber(String roomNumber){
		
		rooms.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select r.room_number, r.Floor, r.Price, r.max_Guest, r.Availability, r.Room_type, rt.Type_Name from room r join room_type rt on(rt.Type_Number = r.Room_type) where Room_Number = \""+roomNumber+"\" and  Availability is true ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Room_Number  = rs.getString("Room_Number");
		          String Floor = rs.getString("Floor");
		          int price  = rs.getInt("Price");
		          int Max_Guest  = rs.getInt("Max_guest");
		          boolean Availability = rs.getBoolean("Availability");
		          String Room_type = rs.getString("Room_type");
		          String Room_typeName = rs.getString("rt.Type_Name");

		          //Display values
		          /*System.out.print("Room_Number: " + Room_Number);
		          System.out.print(", Floor: " + Floor);
		          System.out.print(", price: " + price);
		          System.out.print(", Max_Guest: " + Max_Guest);
		          System.out.print(", Availability: " + Availability);
		          System.out.print(", Room_type: " + Room_type);
		          System.out.println(", Room_typeName: " + Room_typeName);
		          */
		          Room dummy = new Room(Room_Number, Floor, price, Max_Guest, Availability, Room_type, Room_typeName);
		          rooms.add(dummy);
		          
		       }
		      
		}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	//********************************************************************************************************************************************
	//Reservation
	public void retrieveStatementForReservationByID(String ID){
		
		reservations.clear();
		try{
		Connection conn = SQLConnection.getConnection();
		Statement stmt = null;
		 // the mysql insert statement
	      String query = " SELECT * FROM reservation where G_ID =\""+ ID +"\" ";
	      stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery(query);
	      
	      while(rs.next()){
	          //Retrieve by column name
	          String Reservation_Number  = rs.getString("Reservation_Number");
	          String Start_Date = rs.getString("Start_Date");
	          String End_Date = rs.getString("End_Date");
	          String GUEST_ID = rs.getString("GUEST_ID");

	          //Display values
	          /*System.out.print("Reservation_Number: " + Reservation_Number);
	          System.out.print(", Start_Date: " + Start_Date);
	          System.out.print(", End_Date: " + End_Date);
	          System.out.println(", GUEST_ID: " + GUEST_ID);
	          */
	          Reservation dummy = new Reservation(Reservation_Number, Start_Date, End_Date,GUEST_ID);
	          reservations.add(dummy);
	       }
	      	
	      
	      
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForReservationByReservationNumber(String rNum){
		
		reservations.clear();
		try{
		Connection conn = SQLConnection.getConnection();
		Statement stmt = null;
		 // the mysql insert statement
	      String query = " SELECT * FROM reservation where Reservation_Number  = \""+rNum +"\"";
	      stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery(query);
	      
	      while(rs.next()){
	          //Retrieve by column name
	          String Reservation_Number  = rs.getString("Reservation_Number");
	          String Start_Date = rs.getString("Start_Date");
	          String End_Date = rs.getString("End_Date");
	          String GUEST_ID = rs.getString("GUEST_ID");

	          //Display values
	          /*System.out.print("Reservation_Number: " + Reservation_Number);
	          System.out.print(", Start_Date: " + Start_Date);
	          System.out.print(", End_Date: " + End_Date);
	          System.out.println(", GUEST_ID: " + GUEST_ID);
	          */
	          Reservation dummy = new Reservation(Reservation_Number, Start_Date, End_Date,GUEST_ID);
	          reservations.add(dummy);
	       }
	      	
	      
	      
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	//********************************************************************************************************************************************
	//Guest
	public void retrieveStatementForGuestByID(String guest_ID){
		
		guests.clear();
		try{
		Connection conn = SQLConnection.getConnection();
		Statement stmt = null;
		 // the mysql insert statement
	      String query = " SELECT * FROM guest  where ID = \""+guest_ID+"\"";
	      stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery(query);
	      
	      while(rs.next()){
	          //Retrieve by column name
	          String ID  = rs.getString("ID");
	          String FName = rs.getString("FName");
	          String MName = rs.getString("MName");
	          String LName = rs.getString("LName");
	          String Email = rs.getString("Email");

	          //Display values
	          /*System.out.print("ID: " + ID);
	          System.out.print(", FName: " + FName);
	          System.out.print(", MName: " + MName);
	          System.out.print(", LName: " + LName);
	          System.out.println(", Email: " + Email);
	          */
	          Guest dummy = new Guest(ID, FName, MName, LName, Email);
	          guests.add(dummy);
	       }
	      	
	      
	      
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForGuestByName(String guest_fName, String guest_mName, String guest_lName){
		
		guests.clear();
		try{
		Connection conn = SQLConnection.getConnection();
		Statement stmt = null;
		 // the mysql insert statement
	      String query = " SELECT * FROM guest  where FName = \""+guest_fName+"\" and MName = \""+guest_mName+"\" and LName = \""+guest_lName+"\"";
	      stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery(query);
	      
	      while(rs.next()){
	          //Retrieve by column name
	          String ID  = rs.getString("ID");
	          String FName = rs.getString("FName");
	          String MName = rs.getString("MName");
	          String LName = rs.getString("LName");
	          String Email = rs.getString("Email");

	          //Display values
	          /*System.out.print("ID: " + ID);
	          System.out.print(", FName: " + FName);
	          System.out.print(", MName: " + MName);
	          System.out.print(", LName: " + LName);
	          System.out.println(", Email: " + Email);
	          */
	          Guest dummy = new Guest(ID, FName, MName, LName, Email);
	          guests.add(dummy);
	       }
	      	
	      
	      
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForGuestByEmail(String guest_email){
		
		guests.clear();
		try{
		Connection conn = SQLConnection.getConnection();
		Statement stmt = null;
		 // the mysql insert statement
	      String query = " SELECT * FROM guest  where Email = \""+guest_email+"\"";
	      stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery(query);
	      
	      while(rs.next()){
	          //Retrieve by column name
	          String ID  = rs.getString("ID");
	          String FName = rs.getString("FName");
	          String MName = rs.getString("MName");
	          String LName = rs.getString("LName");
	          String Email = rs.getString("Email");

	          //Display values
	          /*System.out.print("ID: " + ID);
	          System.out.print(", FName: " + FName);
	          System.out.print(", MName: " + MName);
	          System.out.print(", LName: " + LName);
	          System.out.println(", Email: " + Email);
	          */
	          Guest dummy = new Guest(ID, FName, MName, LName, Email);
	          guests.add(dummy);
	       }
	      	
	      
	      
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForGuestByPhone(String guest_phone){
		
		guests.clear();
		try{
		Connection conn = SQLConnection.getConnection();
		Statement stmt = null;
		 // the mysql insert statement
	      String query = " select gst.ID, gst.FName, gst.MName, gst.LName, gst.Email from guest gst join guest_phone phone on (phone.GUEST_ID = gst.ID) where phone.PHONE  = "+guest_phone;
	      stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery(query);
	      
	      while(rs.next()){
	          //Retrieve by column name
	          String ID  = rs.getString("ID");
	          String FName = rs.getString("FName");
	          String MName = rs.getString("MName");
	          String LName = rs.getString("LName");
	          String Email = rs.getString("Email");

	          //Display values
	          /*System.out.print("ID: " + ID);
	          System.out.print(", FName: " + FName);
	          System.out.print(", MName: " + MName);
	          System.out.print(", LName: " + LName);
	          System.out.println(", Email: " + Email);
	          */
	          Guest dummy = new Guest(ID, FName, MName, LName, Email);
	          guests.add(dummy);
	       }
	      	
	      
	      
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}

	//********************************************************************************************************************************************
	//Phone numbers
	
	public void retrieveStatementForPhoneNumbersOfGuest(String guest_ID){
		
		guest_Phones.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " SELECT * from guest_phone where GUEST_ID = \""+guest_ID+"\"";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		          String Guest_ID  = rs.getString("Guest_ID");
		          String Phone = rs.getString("Phone");
		          

		          //Display values
		          /*System.out.print("Guest_ID: " + Guest_ID);
		          System.out.println(", Phone: " + Phone);
		          */
		          
		          Guest_Phone dummy = new Guest_Phone(Guest_ID ,Phone);
		          guest_Phones.add(dummy);
		       }
		      	
		      
		      
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
	}
	
	//********************************************************************************************************************************************
	//Parking numbers
	
	public void retrieveStatementForParkingNumberOfroom(String roomNumber){
		
		parkings.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " SELECT * from parking where Room_Number  = \""+roomNumber+"\"";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		          String Room_Number  = rs.getString("Room_Number");
		          String Parking_Number = rs.getString("Parking_Number");
		          

		          //Display values
		          /*System.out.print("Guest_ID: " + Room_Number);
		          System.out.println(", Parking_Number: " + Parking_Number);
		          */
		          Parking dummy = new Parking(Room_Number, Parking_Number);
		          parkings.add(dummy);
		          
		       }
		      	
		      
		      
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
	}
	
	//Manager retrieve operations
	
	//********************************************************************************************************************************************
	//Employees 
	
	public void retrieveStatementForEmployees(){
		
		employees.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select emp.ID, emp.Salary, emp.FName, emp.MName, emp.LName, emp.Department_Number, dpt.Name, emp.Super_ID, mgr.LName from employee emp left outer join employee mgr on (emp.Super_ID = mgr.ID) left outer join department dpt on (emp.Department_Number = dpt.Department_Number); ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String ID  = rs.getString("emp.ID");
		    	  int Salary =  rs.getInt("emp.Salary");
		          String FName = rs.getString("emp.FName");
		          String MName = rs.getString("emp.MName");
		          String LName = rs.getString("emp.LName");
		          String Department_Number = rs.getString("emp.Department_Number");
		          String Department_Name = rs.getString("dpt.Name");
		          String Super_ID = rs.getString("Super_ID");
		          String Super_LName = rs.getString("mgr.LName");

		          //Display values
		          /*System.out.print("ID: " + ID);
		          System.out.print(", Salary: " + Salary);
		          System.out.print(", FName: " + FName);
		          System.out.print(", MName: " + MName);
		          System.out.print(", LName: " + LName);
		          System.out.print(", Department_Number: " + Department_Number);
		          System.out.print(", Department_Name: " + Department_Name);
		          System.out.print(", Super_ID: " + Super_ID);
		          System.out.println(", Super_LName: " + Super_LName);
		          */
		          Employee dummy = new Employee(ID, Salary, FName, MName, LName, Department_Number, Department_Name, Super_ID, Super_LName);
		          employees.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForEmployeesBySalary(String operation, int emp_salary){
		
		employees.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select emp.ID, emp.Salary, emp.FName, emp.MName, emp.LName, emp.Department_Number, dpt.Name, emp.Super_ID, mgr.LName from employee emp left outer join employee mgr on (emp.Super_ID = mgr.ID) left outer join department dpt on (emp.Department_Number = dpt.Department_Number) where emp.Salary "+operation+ " " + emp_salary;
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String ID  = rs.getString("emp.ID");
		    	  int Salary =  rs.getInt("emp.Salary");
		          String FName = rs.getString("emp.FName");
		          String MName = rs.getString("emp.MName");
		          String LName = rs.getString("emp.LName");
		          String Department_Number = rs.getString("emp.Department_Number");
		          String Department_Name = rs.getString("dpt.Name");
		          String Super_ID = rs.getString("Super_ID");
		          String Super_LName = rs.getString("mgr.LName");

		          //Display values
		          /*System.out.print("ID: " + ID);
		          System.out.print(", Salary: " + Salary);
		          System.out.print(", FName: " + FName);
		          System.out.print(", MName: " + MName);
		          System.out.print(", LName: " + LName);
		          System.out.print(", Department_Number: " + Department_Number);
		          System.out.print(", Department_Name: " + Department_Name);
		          System.out.print(", Super_ID: " + Super_ID);
		          System.out.println(", Super_LName: " + Super_LName);
		          */
		          Employee dummy = new Employee(ID, Salary, FName, MName, LName, Department_Number, Department_Name, Super_ID, Super_LName);
		          employees.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForEmployeesByDepartment(String dept_num){
		
		employees.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select emp.ID, emp.Salary, emp.FName, emp.MName, emp.LName, emp.Department_Number, dpt.Name, emp.Super_ID, mgr.LName from employee emp left outer join employee mgr on (emp.Super_ID = mgr.ID) left outer join department dpt on (emp.Department_Number = dpt.Department_Number) where dpt.Department_Number = \"" + dept_num+"\"";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String ID  = rs.getString("emp.ID");
		    	  int Salary =  rs.getInt("emp.Salary");
		          String FName = rs.getString("emp.FName");
		          String MName = rs.getString("emp.MName");
		          String LName = rs.getString("emp.LName");
		          String Department_Number = rs.getString("emp.Department_Number");
		          String Department_Name = rs.getString("dpt.Name");
		          String Super_ID = rs.getString("Super_ID");
		          String Super_LName = rs.getString("mgr.LName");

		          //Display values
		          /*System.out.print("ID: " + ID);
		          System.out.print(", Salary: " + Salary);
		          System.out.print(", FName: " + FName);
		          System.out.print(", MName: " + MName);
		          System.out.print(", LName: " + LName);
		          System.out.print(", Department_Number: " + Department_Number);
		          System.out.print(", Department_Name: " + Department_Name);
		          System.out.print(", Super_ID: " + Super_ID);
		          System.out.println(", Super_LName: " + Super_LName);
		          */
		          Employee dummy = new Employee(ID, Salary, FName, MName, LName, Department_Number, Department_Name, Super_ID, Super_LName);
		          employees.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForEmployeesByName(String emp_fName, String emp_mName, String emp_lName){
		
		employees.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select emp.ID, emp.Salary, emp.FName, emp.MName, emp.LName, emp.Department_Number, dpt.Name, emp.Super_ID, mgr.LName from employee emp left outer join employee mgr on (emp.Super_ID = mgr.ID) left outer join department dpt on (emp.Department_Number = dpt.Department_Number) where emp.FName = \""+emp_fName+"\" and emp.MName = \""+emp_mName+"\" and emp.LName = \""+emp_lName+"\"";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String ID  = rs.getString("emp.ID");
		    	  int Salary =  rs.getInt("emp.Salary");
		          String FName = rs.getString("emp.FName");
		          String MName = rs.getString("emp.MName");
		          String LName = rs.getString("emp.LName");
		          String Department_Number = rs.getString("emp.Department_Number");
		          String Department_Name = rs.getString("dpt.Name");
		          String Super_ID = rs.getString("Super_ID");
		          String Super_LName = rs.getString("mgr.LName");

		          //Display values
		          /*System.out.print("ID: " + ID);
		          System.out.print(", Salary: " + Salary);
		          System.out.print(", FName: " + FName);
		          System.out.print(", MName: " + MName);
		          System.out.print(", LName: " + LName);
		          System.out.print(", Department_Number: " + Department_Number);
		          System.out.print(", Department_Name: " + Department_Name);
		          System.out.print(", Super_ID: " + Super_ID);
		          System.out.println(", Super_LName: " + Super_LName);
		          */
		          Employee dummy = new Employee(ID, Salary, FName, MName, LName, Department_Number, Department_Name, Super_ID, Super_LName);
		          employees.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForEmployeesByID(String emp_ID){
		
		employees.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select emp.ID, emp.Salary, emp.FName, emp.MName, emp.LName, emp.Department_Number, dpt.Name, emp.Super_ID, mgr.LName from employee emp left outer join employee mgr on (emp.Super_ID = mgr.ID) left outer join department dpt on (emp.Department_Number = dpt.Department_Number) where emp.ID  = '" + emp_ID+"'";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String ID  = rs.getString("emp.ID");
		    	  int Salary =  rs.getInt("emp.Salary");
		          String FName = rs.getString("emp.FName");
		          String MName = rs.getString("emp.MName");
		          String LName = rs.getString("emp.LName");
		          String Department_Number = rs.getString("emp.Department_Number");
		          String Department_Name = rs.getString("dpt.Name");
		          String Super_ID = rs.getString("Super_ID");
		          String Super_LName = rs.getString("mgr.LName");

		          //Display values
		          /*System.out.print("ID: " + ID);
		          System.out.print(", Salary: " + Salary);
		          System.out.print(", FName: " + FName);
		          System.out.print(", MName: " + MName);
		          System.out.print(", LName: " + LName);
		          System.out.print(", Department_Number: " + Department_Number);
		          System.out.print(", Department_Name: " + Department_Name);
		          System.out.print(", Super_ID: " + Super_ID);
		          System.out.println(", Super_LName: " + Super_LName);
		          */
		          Employee dummy = new Employee(ID, Salary, FName, MName, LName, Department_Number, Department_Name, Super_ID, Super_LName);
		          employees.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}	

	//********************************************************************************************************************************************
	// departments
	
	public void retrieveStatementForDerpartments(){
		
		departments.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select * from department ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Department_Number  = rs.getString("Department_Number");
		          String Name = rs.getString("Name");
		          String Manager_ID = rs.getString("Manager_ID");
		          

		          //Display values
		          /*System.out.print("Department_Number: " + Department_Number);
		          System.out.print(", Name: " + Name);
		          System.out.println(", Manager_ID: " + Manager_ID);
		          */
		          Department dummy = new Department(Department_Number, Name, Manager_ID);
		          departments.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}

	public void retrieveStatementForDerpartmentByName(String dept_name){
		
		departments.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select * from department where Name = \""+dept_name+"\" ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Department_Number  = rs.getString("Department_Number");
		          String Name = rs.getString("Name");
		          String Manager_ID = rs.getString("Manager_ID");
		          

		          //Display values
		          /*System.out.print("Department_Number: " + Department_Number);
		          System.out.print(", Name: " + Name);
		          System.out.println(", Manager_ID: " + Manager_ID);
		          */
		          Department dummy = new Department(Department_Number, Name, Manager_ID);
		          departments.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForDerpartmentByNumber(String dept_number){
		
		departments.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select * from department where Department_Number =  \""+dept_number+"\"";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Department_Number  = rs.getString("Department_Number");
		          String Name = rs.getString("Name");
		          String Manager_ID = rs.getString("Manager_ID");
		          

		          //Display values
		          /*System.out.print("Department_Number: " + Department_Number);
		          System.out.print(", Name: " + Name);
		          System.out.println(", Manager_ID: " + Manager_ID);
		          */
		          Department dummy = new Department(Department_Number, Name, Manager_ID);
		          departments.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void retrieveStatementForDerpartmentByManagerID(String mgr_ID){
		
		departments.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select * from department where Manager_ID =  \""+mgr_ID+"\"";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String Department_Number  = rs.getString("Department_Number");
		          String Name = rs.getString("Name");
		          String Manager_ID = rs.getString("Manager_ID");
		          

		          //Display values
		          /*System.out.print("Department_Number: " + Department_Number);
		          System.out.print(", Name: " + Name);
		          System.out.println(", Manager_ID: " + Manager_ID);
		          */
		          Department dummy = new Department(Department_Number, Name, Manager_ID);
		          departments.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	//********************************************************************************************************************************************
	// Services 
	
	public void retrieveStatementservices(){
		
		services.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " SELECT * from provide_service ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		          String Department_Number  = rs.getString("Department_Number");
		          String Room_Number = rs.getString("Room_Number");
		          

		          //Display values
		          /*System.out.print("Department_Number: " + Department_Number);
		          System.out.println(", Room_Number: " + Room_Number);
		          */
		          Provide_Service dummy = new Provide_Service(Department_Number, Room_Number);
		          services.add(dummy);
		          
		       }
		      	
		      
		      
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
	}
	
	public void retrieveStatementservicesOfroom(String roomNumber){
		
		services.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " SELECT * from provide_service where Room_Number =  \""+roomNumber+"\"";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		          String Department_Number  = rs.getString("Department_Number");
		          String Room_Number = rs.getString("Room_Number");
		          

		          //Display values
		          /*System.out.print("Department_Number: " + Department_Number);
		          System.out.println(", Room_Number: " + Room_Number);
		          */
		          Provide_Service dummy = new Provide_Service(Department_Number, Room_Number);
		          services.add(dummy);
		          
		       }
		      	
		      
		      
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
	}

	public void retrieveStatementservicesOfDepartment(String deptNumber){
		
		services.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " SELECT * from provide_service where Department_Number =  \""+deptNumber+"\"";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		          String Department_Number  = rs.getString("Department_Number");
		          String Room_Number = rs.getString("Room_Number");
		          

		          //Display values
		          /*System.out.print("Department_Number: " + Department_Number);
		          System.out.println(", Room_Number: " + Room_Number);
		          */
		          Provide_Service dummy = new Provide_Service(Department_Number, Room_Number);
		          services.add(dummy);
		          
		       }
		      	
		      
		      
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
	}
	
	//********************************************************************************************************************************************
	// reports
	
	public void reports(){
		
		
		reports.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " SELECT r.Reservation_Number , r.Start_Date, r.End_Date, rm.Room_Number, rt.Type_Name from reservation r join has_room hr on (r.Reservation_Number = hr.Reservation_Number) join room rm on(rm.Room_Number = hr.Room_Number) join room_type rt on(rt.Type_Number = rm.Room_type) WHERE Start_Date between DATE_FORMAT( CURRENT_DATE - INTERVAL 1 MONTH, '%Y/%m/01' ) AND DATE_FORMAT( CURRENT_DATE, '%Y/%m/01' )";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		          String Reservation_Number  = rs.getString("Reservation_Number");
		          String Start_Date = rs.getString("Start_Date");
		          String End_Date = rs.getString("End_Date");
		          String Room_Number  = rs.getString("Room_Number");
		          String Room_typeName = rs.getString("rt.Type_Name");
		          

		          //Display values
		          /*System.out.print("Reservation_Number: " + Reservation_Number);
		          System.out.print(", Start_Date: " + Start_Date);
		          System.out.print(", End_Date: " + End_Date);
		          System.out.print(", Room_Number: " + Room_Number);
		          System.out.println(", Room_typeName: " + Room_typeName);
		          */
		          Report dummy = new Report(Reservation_Number, Start_Date, End_Date, Room_Number, Room_typeName);
		          reports.add(dummy);
		       }
		      	
		      
		      
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
		
	}
	
public void retrieveStatementForEmployeesReport(){
		
		employees.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " select emp.ID, emp.Salary, emp.FName, emp.MName, emp.LName, emp.Department_Number, dpt.Name, emp.Super_ID, mgr.LName from employee emp left outer join employee mgr on (emp.Super_ID = mgr.ID) left outer join department dpt on (emp.Department_Number = dpt.Department_Number) order by dpt.Name; ";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		          //Retrieve by column name
		    	  String ID  = rs.getString("emp.ID");
		    	  int Salary =  rs.getInt("emp.Salary");
		          String FName = rs.getString("emp.FName");
		          String MName = rs.getString("emp.MName");
		          String LName = rs.getString("emp.LName");
		          String Department_Number = rs.getString("emp.Department_Number");
		          String Department_Name = rs.getString("dpt.Name");
		          String Super_ID = rs.getString("Super_ID");
		          String Super_LName = rs.getString("mgr.LName");

		          //Display values
		          /*System.out.print("ID: " + ID);
		          System.out.print(", Salary: " + Salary);
		          System.out.print(", FName: " + FName);
		          System.out.print(", MName: " + MName);
		          System.out.print(", LName: " + LName);
		          System.out.print(", Department_Number: " + Department_Number);
		          System.out.print(", Department_Name: " + Department_Name);
		          System.out.print(", Super_ID: " + Super_ID);
		          System.out.println(", Super_LName: " + Super_LName);
		          */
		          Employee dummy = new Employee(ID, Salary, FName, MName, LName, Department_Number, Department_Name, Super_ID, Super_LName);
		          employees.add(dummy);
		       }
		      
		      
		      
	}catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void revenue(){
		
		revenues.clear();
		try{
			Connection conn = SQLConnection.getConnection();
			Statement stmt = null;
			 // the mysql insert statement
		      String query = " SELECT rt.Type_Name , sum(rm.Price) as revenue from reservation r join has_room hr on (r.Reservation_Number = hr.Reservation_Number) join room rm on(rm.Room_Number = hr.Room_Number) join room_type rt on(rt.Type_Number = rm.Room_type) WHERE Start_Date between DATE_FORMAT( CURRENT_DATE - INTERVAL 1 MONTH, '%Y/%m/01' ) AND DATE_FORMAT( CURRENT_DATE, '%Y/%m/01' ) group by(rm.Room_type)";
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while(rs.next()){
		    	 
		          //Retrieve by column name
		          String roomType  = rs.getString("rt.Type_Name");
		          int revenue = rs.getInt("revenue");
		          

		          //Display values
		          /*System.out.print("Department_Number: " + Department_Number);
		          System.out.println(", Room_Number: " + Room_Number);
		          */
		          Revenue dummy = new Revenue(roomType, revenue);
		          revenues.add(dummy);
		          
		       }
		      	
		      
		      
		      
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
	}
}
