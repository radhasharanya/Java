package dayAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		
		try {
			File f = new File("file.txt");
			BufferedReader br= new BufferedReader(new FileReader(f));
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
