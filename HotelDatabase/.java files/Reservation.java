import java.util.Formatter;


public class Reservation {
	
	private String Reservation_Number;
	private String Start_Date;
	private String End_Date;
	private String G_ID;
	
	public Reservation( String Reservation_Number, String Start_Date, String End_Date, String G_ID){
		this.Reservation_Number = Reservation_Number;
		this.Start_Date = Start_Date;
		this.End_Date = End_Date;
		this.G_ID = G_ID; 
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

	public String getG_ID() {
		return G_ID;
	}

	public void setG_ID(String g_ID) {
		G_ID = g_ID;
	}

	@Override
	public String toString() {
		
		
		StringBuilder stringBuilder = new StringBuilder();
	      Formatter formatter = new Formatter(stringBuilder);
	      String template = "  %-6s | %-11s | %-11s | %-10s ";
	      formatter.format(template, Reservation_Number , Start_Date, End_Date,G_ID
	    		 );
	      formatter.close();
	      //System.out.println(stringBuilder.toString());
	      return stringBuilder.toString();
	}
	
	

}
