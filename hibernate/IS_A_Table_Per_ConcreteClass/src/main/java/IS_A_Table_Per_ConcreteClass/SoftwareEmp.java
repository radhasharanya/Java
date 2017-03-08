package IS_A_Table_Per_ConcreteClass;

public class SoftwareEmp extends Employee {
	private String tool;

	public SoftwareEmp(int id, String name, String email, int salary, String tool) {
		super(id, name, email, salary);
		this.tool = tool;
	}

	public SoftwareEmp() {
		
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}
	

}
