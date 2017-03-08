package _to_1._to_1;

import java.util.Date;

public class Voting {

	private int vtid;
	private String pname;
	private Date cdate;
	private Voter voter;
	public int getVtid() {
		return vtid;
	}
	public void setVtid(int vtid) {
		this.vtid = vtid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	public Voting(int vtid, String pname, Date cdate, Voter voter) {
		super();
		this.vtid = vtid;
		this.pname = pname;
		this.cdate = cdate;
		this.voter = voter;
	}
	public Voting() {
		
	}
	
	

}
