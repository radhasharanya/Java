
public class Palindrome {

	public static void main(String[] args) {
		int n=121,reverse=0;
		
		int num=n;
		while(num!=0)
		{
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		
		if(n==reverse)
		{
			System.out.println(reverse+" Number is Palindrome");
			
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}

}
