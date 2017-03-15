import java.util.Formatter;


public class Room {
	
	private String Room_Number;
	private String Floor;
	private double Price;
	private int Max_Guest;
	private boolean availability;
	private String Room_type;
	private String Room_typeName;
	
	public Room(String Room_Number, String Floor, double Price, int Max_Guest, boolean availability, String Room_type ,String Room_typeName ){
		this.Room_Number = Room_Number;
		this.Floor = Floor;
		this.Price = Price;
		this.Max_Guest = Max_Guest;
		this.availability = availability;
		this.Room_type = Room_type; 
		this.Room_typeName = Room_typeName;
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	public String getFloor() {
		return Floor;
	}

	public void setFloor(String floor) {
		Floor = floor;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getMax_Guest() {
		return Max_Guest;
	}

	public void setMax_Guest(int max_Guest) {
		Max_Guest = max_Guest;
	}

	

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getRoom_type() {
		return Room_type;
	}

	public void setRoom_type(String room_type) {
		Room_type = room_type;
	}

	public String getRoom_typeName() {
		return Room_typeName;
	}

	public void setRoom_typeName(String room_typeName) {
		Room_typeName = room_typeName;
	}

	@Override
	public String toString() {
		
	
			StringBuilder stringBuilder1 = new StringBuilder();
	      Formatter formatter = new Formatter(stringBuilder1);
	      String template = "%-3s | %-1s | %-3.0f | %-2s | %-5s | %-1s | %-10s";
	      formatter.format(template, Room_Number , Floor, Price,
	    		  Max_Guest, availability, Room_type , Room_typeName);
	      formatter.close();
	      //System.out.println(stringBuilder.toString());
	      
	      return stringBuilder1.toString();
		
		
		
	}
	
	

}
