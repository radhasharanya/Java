package bean;



import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class RequiredCollectionDI {
	private Vector fruits;
	private TreeSet  cricketers;
	private HashMap cc;	
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCc(HashMap cc) {
		this.cc = cc;
	}
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	
	
	public void printData()
	{
		System.out.println("Fruits................");
		for(Object fruit: fruits){
			System.out.println(fruit);
		}
		System.out.println("cricketers................");
		for(Object criketer:cricketers)
		{
			System.out.println(criketer);
			
		
		}
		System.out.println("Country and capital");
		
		Set keys=cc.keySet();
		for(Object key:keys){
			System.out.println("Country"+key+":country"+cc.get(key));
		}
		
	}
	

}
