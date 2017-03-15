import java.text.NumberFormat;
import java.util.Formatter;


public class Employee {
	
	private String ID;
	private double Salary;
	private String FName;
	private String MName;
	private String LName;
	private String Department_Number;
	private String Department_Name;
	private String Super_ID;
	//private String Super_FName;
	//private String Super_MName;
	private String Super_LName;
	
	
	public Employee(String ID, double Salary, String FName, String MName, String LName, String Department_Number, String Department_Name, String Super_ID, String Super_LName){
		this.ID = ID;
		this.Salary = Salary; 
		this.FName = FName;
		this.MName = MName;
		this.LName = LName;
		this.Department_Number = Department_Number;
		this.Department_Name = Department_Name;
		this.Super_ID  = Super_ID;
		//this.Super_FName = Super_FName;
		//this.Super_MName = Super_MName;
		this.Super_LName = Super_LName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
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

	public String getDepartment_Number() {
		return Department_Number;
	}

	public void setDepartment_Number(String department_Number) {
		Department_Number = department_Number;
	}

	public String getSuper_ID() {
		return Super_ID;
	}

	public void setSuper_ID(String super_ID) {
		Super_ID = super_ID;
	}

	public String getDepartment_Name() {
		return Department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		Department_Name = department_Name;
	}

	
	public String getSuper_LName() {
		return Super_LName;
	}

	public void setSuper_LName(String super_LName) {
		Super_LName = super_LName;
	}

	@Override
	public String toString() {
		/*
		return "Employee [ID=" + ID + ", Salary=" + Salary + ", FName=" + FName
				+ ", MName=" + MName + ", LName=" + LName
				+ ", Department_Number=" + Department_Number
				+ ", Department_Name=" + Department_Name + ", Super_ID="
				+ Super_ID + ", Super_LName=" + Super_LName + "]";
		*/
		
	      StringBuilder stringBuilder = new StringBuilder();
	      Formatter formatter = new Formatter(stringBuilder);
	      String template = "%-3s | %-15s | %-15s | %-15s | %6.0f | %15s";
	      formatter.format(template, ID , FName, MName,
	    		  LName, Salary, Department_Name);
	      formatter.close();
	      //System.out.println(stringBuilder.toString());
	      return stringBuilder.toString();
	}
	
	

}
