
public class Parking {
	private String Room_Number;
	private String Parking_Number;
	
	public Parking(String Room_Number, String Parking_Number ){
		this.Room_Number = Room_Number;
		this.Parking_Number = Parking_Number; 
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	public String getParking_Number() {
		return Parking_Number;
	}

	public void setParking_Number(String parking_Number) {
		Parking_Number = parking_Number;
	}

	@Override
	public String toString() {
		return "Parking [Room_Number=" + Room_Number + ", Parking_Number="
				+ Parking_Number + "]";
	}
	
	

}
