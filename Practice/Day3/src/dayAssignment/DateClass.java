package dayAssignment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		DateFormat df=new SimpleDateFormat("MM/DD/YY");
		Date d= new Date();
			System.out.println("Current date"+df.format(d)	);
			System.out.println("Current Date with Timestamp "+d);
	}

}
