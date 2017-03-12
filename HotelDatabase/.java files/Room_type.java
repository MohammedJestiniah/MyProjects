
public class Room_type {
	private String Room_Number;
	private String Type_Number;
	private String Type_Name;
	
	public Room_type(String Room_Number, String Type_Number, String	Type_Name){
		this.Room_Number = Room_Number;
		this.Type_Number = Type_Number;
		this.Type_Name = Type_Name;
		
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	public String getType_Number() {
		return Type_Number;
	}

	public void setType_Number(String type_Number) {
		Type_Number = type_Number;
	}

	public String getType_Name() {
		return Type_Name;
	}

	public void setType_Name(String type_Name) {
		Type_Name = type_Name;
	}

	@Override
	public String toString() {
		return "Room_type [Room_Number=" + Room_Number + ", Type_Number="
				+ Type_Number + ", Type_Name=" + Type_Name + "]";
	}
	
	

}
