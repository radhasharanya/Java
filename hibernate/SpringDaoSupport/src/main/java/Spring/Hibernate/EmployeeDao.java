package Spring.Hibernate;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class EmployeeDao extends HibernateDaoSupport {  
/*HibernateTemplate temp;  
public HibernateTemplate getTemp() {
	return temp;
}
public void setTemp(HibernateTemplate temp) {
	this.temp = temp;
}*/
public EmployeeDao() {
	
}
//method to save employee  
public void saveEmployee(Employee e){  
	getHibernateTemplate().save(e);  
}  
//method to update employee  
public void updateEmployee(Employee e){  
	getHibernateTemplate().update(e);  
}  
//method to delete employee  
public void deleteEmployee(Employee e){  
	getHibernateTemplate().delete(e);  
}  
//method to return one employee of given id  
public Employee getById(int id){  
    Employee e=(Employee)getHibernateTemplate().get(Employee.class,id);  
    return e;  
}  
//method to return all employees  
public List<Employee> getEmployees(){  
    List<Employee> list=new ArrayList<Employee>();  
    list=getHibernateTemplate().loadAll(Employee.class);  
    return list;  
}  
}  