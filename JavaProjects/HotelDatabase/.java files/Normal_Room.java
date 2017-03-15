
public class Normal_Room {
	
	private String Room_Number;
	private String Number_Of_Beds;
	
	public Normal_Room(){
		this.Room_Number = Room_Number;
		this.Number_Of_Beds = Number_Of_Beds; 
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	public String getNumber_Of_Beds() {
		return Number_Of_Beds;
	}

	public void setNumber_Of_Beds(String number_Of_Beds) {
		Number_Of_Beds = number_Of_Beds;
	}

	@Override
	public String toString() {
		return "Normal_Room [Room_Number=" + Room_Number + ", Number_Of_Beds="
				+ Number_Of_Beds + "]";
	}
	
	
	

}
