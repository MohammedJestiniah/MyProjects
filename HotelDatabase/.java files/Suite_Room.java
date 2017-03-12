
public class Suite_Room {
	
	private String Room_Number;
	private String Number_Of_SubRoom;
	
	public Suite_Room(String Room_Number,String Number_Of_SubRoom){
		this.Room_Number = Room_Number;
		this.Number_Of_SubRoom = Number_Of_SubRoom; 
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	public String getNumber_Of_SubRoom() {
		return Number_Of_SubRoom;
	}

	public void setNumber_Of_SubRoom(String number_Of_SubRoom) {
		Number_Of_SubRoom = number_Of_SubRoom;
	}

	@Override
	public String toString() {
		return "Suite_Room [Room_Number=" + Room_Number
				+ ", Number_Of_SubRoom=" + Number_Of_SubRoom + "]";
	}
	
	

}
