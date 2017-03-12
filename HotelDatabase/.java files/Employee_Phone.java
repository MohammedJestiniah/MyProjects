
public class Employee_Phone {
	
	private String E_ID;
	private String Phone;
	
	public Employee_Phone (String E_ID, String Phone){
		this.E_ID = E_ID;
		this.Phone = Phone;
	}

	public String getE_ID() {
		return E_ID;
	}

	public void setE_ID(String e_ID) {
		E_ID = e_ID;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Employee_Phone [E_ID=" + E_ID + ", Phone=" + Phone + "]";
	}
	
	

}
