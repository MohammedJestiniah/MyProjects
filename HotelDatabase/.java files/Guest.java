import java.util.Formatter;


public class Guest {
	
	private String ID;
	private String FName;
	private String MName;
	private String LName;
	private String Email;
	
	public Guest(String ID, String FName, String MName, String LName, String Email ){
		this.ID = ID;
		this.FName = FName;
		this.MName = MName;
		this.LName = LName;
		this.Email = Email;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getMName() {
		return MName;
	}

	public void setMName(String mName) {
		MName = mName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		
		   StringBuilder stringBuilder = new StringBuilder();
		      Formatter formatter = new Formatter(stringBuilder);
		      String template = "%-3s | %-15s| %-15s| %-15s|  %15s";
		      formatter.format(template, ID , FName, MName,
		    		  LName,  Email);
		      formatter.close();
		      //System.out.println(stringBuilder.toString());
		      return stringBuilder.toString();
		
	}
	
	

}
