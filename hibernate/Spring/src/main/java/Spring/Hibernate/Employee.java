package Spring.Hibernate;

public class Employee {  
private int id;  
private String name;  
private String email;
private float salary;
public Employee() {
	
}
public int getId() {
	return id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
} 

}
