
public class ReverseNumber {
	public static void main(String[] args) {
		int n=12,rev=0;
		
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
			

		}
		System.out.println("Reverse of the number  is"+rev);
	}

}