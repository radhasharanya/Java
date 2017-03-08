package Many_to_Many.Ormrelation;

import java.util.Set;

public class Faculty {
	private int fid;
	private String fname;
	private int yearex;
	private Set<Course> course;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getYearex() {
		return yearex;
	}
	public void setYearex(int yearex) {
		this.yearex = yearex;
	}
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	public Faculty(int fid, String fname, int yearex, Set<Course> course) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.yearex = yearex;
		this.course = course;
	}
	public Faculty() {
		
	}
	

}
