package IS_A_Table_Per_SubClass.IS_A_Table_Per_SubClass;

public class HardwareEmp extends Employee {
	private int wh;

	public HardwareEmp(int id, String name, String email, int salary, int wh) {
		super(id, name, email, salary);
		this.wh = wh;
	}

	public HardwareEmp() {
		
	}

	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		this.wh = wh;
	}
	

}
