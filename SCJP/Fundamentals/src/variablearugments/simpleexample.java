package variablearugments;

public class simpleexample {
	public static void add(int... x)
	{
		System.out.println("Var argument method");
		System.out.println(x.length);
	}

	public static void main(String[] args) {
		add();
		add(10);
		add(10,20);
		add(10,20,30);

	}

}
