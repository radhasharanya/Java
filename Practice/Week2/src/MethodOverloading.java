
public class MethodOverloading {
	 
	void area(int l, int b)
	{
		System.out.println("Area of Rectangle "+ l*b);
	}
	
	void area(int l)
	{
		System.out.println("Area of square " +l*l);
	}
	
	 

	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.area(2);
		m.area(2, 3);
	}

}
