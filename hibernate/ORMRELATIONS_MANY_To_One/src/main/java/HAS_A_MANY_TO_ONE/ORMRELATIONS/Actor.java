package HAS_A_MANY_TO_ONE.ORMRELATIONS;

import java.util.Set;

public class Actor {
	private int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Actor() {
		
	}
	public Actor(int id, String name) {
		super();
		this.aid = id;
		this.name = name;
	}
	

}