package IS_A_Table_Per_ConcreteClass;

public class Admin extends Employee {

	private String branchname;

	public Admin(int id, String name, String email, int salary, String branchname) {
		super(id, name, email, salary);
		this.branchname = branchname;
	}

	public Admin() {
		
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	
	
}
