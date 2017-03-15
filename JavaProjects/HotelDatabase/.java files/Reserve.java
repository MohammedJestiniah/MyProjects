
public class Reserve {
	
	private String Guest_ID;
	private String Employee_ID;
	private String Reserve_Number;
	
	public Reserve(String Guest_ID, String Employee_ID,String Reserve_Number){
		this.Guest_ID = Guest_ID;
		this.Employee_ID = Employee_ID;
		this.Reserve_Number = Reserve_Number; 
	}

	public String getGuest_ID() {
		return Guest_ID;
	}

	public void setGuest_ID(String guest_ID) {
		Guest_ID = guest_ID;
	}

	public String getEmployee_ID() {
		return Employee_ID;
	}

	public void setEmployee_ID(String employee_ID) {
		Employee_ID = employee_ID;
	}

	public String getReserve_Number() {
		return Reserve_Number;
	}

	public void setReserve_Number(String reserve_Number) {
		Reserve_Number = reserve_Number;
	}

	@Override
	public String toString() {
		return "Reserve [Guest_ID=" + Guest_ID + ", Employee_ID=" + Employee_ID
				+ ", Reserve_Number=" + Reserve_Number + "]";
	}
	
	

}
