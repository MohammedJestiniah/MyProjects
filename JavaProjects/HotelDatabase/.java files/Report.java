import java.util.Formatter;


public class Report {
	
	private String Reservation_Number;
	private String Start_Date;
	private String End_Date;
	private String Room_Number;
	private String Room_typeName;
	
	public Report(String Reservation_Number, String Start_Date, String End_Date, String Room_Number, String Room_typeName){
		this.Reservation_Number = Reservation_Number;
		this.Start_Date = Start_Date;
		this.End_Date = End_Date;
		this.Room_Number = Room_Number;
		this.Room_typeName = Room_typeName; 
	}

	public String getReservation_Number() {
		return Reservation_Number;
	}

	public void setReservation_Number(String reservation_Number) {
		Reservation_Number = reservation_Number;
	}

	public String getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}

	public String getEnd_Date() {
		return End_Date;
	}

	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	public String getRoom_typeName() {
		return Room_typeName;
	}

	public void setRoom_typeName(String room_typeName) {
		Room_typeName = room_typeName;
	}

	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
	      Formatter formatter = new Formatter(stringBuilder);
	      String template = "  %-6s | %-11s | %-11s | %-3s ";
	      formatter.format(template, Reservation_Number , Start_Date, End_Date,Room_Number
	    		 );
	      formatter.close();
	      //System.out.println(stringBuilder.toString());
	      return stringBuilder.toString();
	}
	
	

}
