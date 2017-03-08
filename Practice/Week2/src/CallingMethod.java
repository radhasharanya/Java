
public class CallingMethod {
	
	 void print(int a , int b)
	{
		System.out.println("From Print method");
		add(a,b);
	}
	
	void add(int l ,int b)
	{
		System.out.println("From add method "+(1+b));
	}
	
	

	public static void main(String[] args) {
		CallingMethod c=new CallingMethod();
		c.print(1, 2);
		

	}

}
