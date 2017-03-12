
public class Has_Room {
	
	private String Reservation_Number;
	private String Room_Number;
	
	public Has_Room(String Reservation_Number, String Room_Number){
		this.Reservation_Number = Reservation_Number;
		this.Room_Number = Room_Number; 
	}

	public String getReservation_Number() {
		return Reservation_Number;
	}

	public void setReservation_Number(String reservation_Number) {
		Reservation_Number = reservation_Number;
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	@Override
	public String toString() {
		return "Has_Room [Reservation_Number=" + Reservation_Number
				+ ", Room_Number=" + Room_Number + "]";
	}
	
	

}
