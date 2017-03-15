
public class Studio_Room {
	private String Room_Number;
	private String Number_Of_Sofa;
	
	public Studio_Room(String Room_Number, String Number_Of_Sofa){
		this.Room_Number = Room_Number;
		this.Number_Of_Sofa = Number_Of_Sofa; 
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	public String getNumber_Of_Sofa() {
		return Number_Of_Sofa;
	}

	public void setNumber_Of_Sofa(String number_Of_Sofa) {
		Number_Of_Sofa = number_Of_Sofa;
	}

	@Override
	public String toString() {
		return "Studio_Room [Room_Number=" + Room_Number + ", Number_Of_Sofa="
				+ Number_Of_Sofa + "]";
	}
	
	
	
	

}
