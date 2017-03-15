import java.util.Formatter;


public class Provide_Service {
	
	private String Department_Number;
	private String Room_Number;
	
	public Provide_Service(String Department_Number, String Room_Number){
		this.Department_Number = Department_Number;
		this.Room_Number = Room_Number;
			
	}

	public String getDepartment_Number() {
		return Department_Number;
	}

	public void setDepartment_Number(String department_Number) {
		Department_Number = department_Number;
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
	      Formatter formatter = new Formatter(stringBuilder);
	      String template = "  %-1s   |  %-3s";
	      formatter.format(template, Department_Number , Room_Number);
	      formatter.close();
	      //System.out.println(stringBuilder.toString());
	      return stringBuilder.toString();
	}
	
	

}
