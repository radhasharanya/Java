package hibernate.CrudInsert;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name="tblstudent")
public class Student {

	@Id
	private int sid;
	@Column(name="name")
	private String sname;
	@Transient
	
	private String smarks;
	
	
	public String getSmarks() {
		return smarks;
	}
	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
