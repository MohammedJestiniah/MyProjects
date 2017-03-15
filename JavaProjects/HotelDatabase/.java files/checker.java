import java.util.regex.Pattern;

public class checker {
	
	public checker(){
		
	}
	
	public boolean checkNationalID(String id){
		if(id.length() != 10){
			System.out.println("Error!!! ID length != 10");
			return false;
		}else if(!id.matches("[0-9]+")){
			System.out.println("Error!!! ID not numaric only");
			return false;
		}else{
			return true;
		}
		
	}
	
	public boolean checkName(String name){
		if(name.length() > 15){
			System.out.println("Error!!! Name length > 15");
			return false;
			
		}else if(!Pattern.matches("[a-zA-Z]+",name)){
			System.out.println("Error!!! Name not alphabet only");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkEmail(String email){
		if(email.length() > 30){
			System.out.println("Error!!! Email length > 30");
			return false;
		}else if(!(email.contains("@") && email.contains(".com"))){
			System.out.println("Error!!! Email not includes @ or .com");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkPhone(String phone){
		if(phone.isEmpty()){
			return true;
		
		}if(phone.length() != 10){
			System.out.println("Error!!! Phone length != 10");
			return false;
		}else if(!phone.matches("[0-9]+")){
			System.out.println("Error!!! Phone not numaric only");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkReservationNumber(String rNum){
		if(rNum.length() != 6){
			System.out.println("Error!!! Reservation Number length != 6");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkEmployeeID(String eID){
		if(eID.length() != 3){
			System.out.println("Error!!! Employee ID length != 3");
			return false;
		}else if(!eID.matches("[0-9]+")){
			System.out.println("Error!!! Employee ID not numaric only");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkSalary(String salary){
		if(!salary.matches("[0-9]+")){
			System.out.println("Error!!! Salary not numaric only");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkDepartmentNumber(String dNum){
		if(dNum.length() > 2){
			System.out.println("Error!!! Department Number length != 2");
			return false;
		}else if(!dNum.matches("[0-9]+")){
			System.out.println("Error!!! Department Number not numaric only");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkSupervisorID(String sID){
		if(sID.isEmpty()){
			return true;
		}
	else if(sID.length() != 3){
			System.out.println("Error!!! Supervisor ID length != 3");
			return false;
		}else if(!sID.matches("[0-9]+")){
			System.out.println("Error!!! Supervisor ID not numaric only");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkManagerID(String mID){
		if(mID.isEmpty()){
			return true;
		}
		else if(mID.length() != 3){
			System.out.println("Error!!! Manager ID length != 3");
			return false;
		}else if(!mID.matches("[0-9]+")){
			System.out.println("Error!!! Manager ID not numaric only");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkRoomNumber(String roomNumber){
		if(roomNumber.length() != 3){
			System.out.println("Error!!! Room number length != 3");
			return false;
		}else if(!roomNumber.matches("[0-9]+")){
			System.out.println("Error!!! Room number not numaric only");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkDepartmentName(String dName){
		if(dName.length() > 15){
			System.out.println("Error!!! Department Name length > 15");
			return false;
			
		}else if(!Pattern.matches("[a-zA-Z]+",dName)){
			System.out.println("Error!!! Department Name not alphabet only");
			return false;
		}else{
			return true;
		}
	}

}
