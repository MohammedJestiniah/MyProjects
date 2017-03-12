
public class Guest_Phone {
	private String Guest_ID;
	private String Phone;
	
	public Guest_Phone(String Guest_ID, String Phone){
		this.Guest_ID = Guest_ID;
		this.Phone = Phone;
	}

	public String getGuest_ID() {
		return Guest_ID;
	}

	public void setGuest_ID(String guest_ID) {
		Guest_ID = guest_ID;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Guest_Phone [Guest_ID=" + Guest_ID + ", Phone=" + Phone + "]";
	}
	
	

}
