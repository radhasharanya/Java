
public class Constructor {
	String name;
	
	Constructor()
	{
		System.out.println("Default Constructor");
	}
	Constructor(String name)
	{
		System.out.println("Hello  "+name+" from Parameterized Constructor");
	}
	

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor con= new Constructor("Geo");

	}

}
