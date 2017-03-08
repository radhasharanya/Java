
public class CommandLineArgument {

	public static void main(String[] args) {
		System.out.println("Please enter arguments");
		for(int i=0;i<args.length;i++)
		{
			int a= Integer.parseInt(args[i]);
			System.out.println("Square of "+args[i] +"is " +a*a);
			a=0;
		}

	}

}
