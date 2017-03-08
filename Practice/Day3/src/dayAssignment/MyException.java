package dayAssignment;

public class MyException extends Exception{
	int num;
	public MyException(int n) {
		num=n;
		
	}
	public String toString()
	{
		return("Even number"+num);
	}

}
