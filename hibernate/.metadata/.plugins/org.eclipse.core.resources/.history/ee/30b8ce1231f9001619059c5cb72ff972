package Spring.Hibernate;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {  
HibernateTemplate temp;  
public HibernateTemplate getTemp() {
	return temp;
}
public void setTemp(HibernateTemplate temp) {
	this.temp = temp;
}
public EmployeeDao() {
	
}
//method to save employee  
public void saveEmployee(Employee e){  
    temp.save(e);  
}  
//method to update employee  
public void updateEmployee(Employee e){  
    temp.update(e);  
}  
//method to delete employee  
public void deleteEmployee(Employee e){  
    temp.delete(e);  
}  
//method to return one employee of given id  
public Employee getById(int id){  
    Employee e=(Employee)temp.get(Employee.class,id);  
    return e;  
}  
//method to return all employees  
public List<Employee> getEmployees(){  
    List<Employee> list=new ArrayList<Employee>();  
    list=temp.loadAll(Employee.class);  
    return list;  
}  
}  