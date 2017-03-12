import java.util.Formatter;


public class Department {

	private String Department_Number;
	private String Name;
	private String Manager_ID;
	
	Department(String Department_Number,String Name, String Manager_ID){
		this.Department_Number = Department_Number;
		this.Name = Name;
		this.Manager_ID = Manager_ID; 
	}

	public String getDepartment_Number() {
		return Department_Number;
	}

	public void setDepartment_Number(String department_Number) {
		Department_Number = department_Number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getManager_ID() {
		return Manager_ID;
	}

	public void setManager_ID(String manager_ID) {
		Manager_ID = manager_ID;
	}

	@Override
	public String toString() {
		/*
		return "Department [Department_Number=" + Department_Number + ", Name="
				+ Name + ", Manager_ID=" + Manager_ID + "]";
		*/
		   StringBuilder stringBuilder = new StringBuilder();
		      Formatter formatter = new Formatter(stringBuilder);
		      String template = "  %-3s | %-15s | %-3s ";
		      formatter.format(template, Department_Number , Name, Manager_ID
		    		 );
		      formatter.close();
		      //System.out.println(stringBuilder.toString());
		      return stringBuilder.toString();
	}
	
	
}
