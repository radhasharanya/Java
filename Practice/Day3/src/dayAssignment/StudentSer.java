package dayAssignment;

import java.io.Serializable;

public class StudentSer implements Serializable {
	String name;
	int  Marks;
	int id;
	
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
