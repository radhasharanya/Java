package variablearugments;

public class Add {
	public static void add(int... x)
	{
		//System.out.println("Var argument method");
		//System.out.println(x.length);
		int length =0;
		for(int x1:x)
		{
			length=x1+length;
			
		}
		System.out.println("Addition is "+length);
	}

	public static void main(String[] args) {
		add();
		add(10);
		add(10,20);
		add(10,20,30);

	}

}
