package dayAssignment;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;

public class WritingFile {

	public static void main(String[] args) {
		try{
			File f = new File("File.txt");
			FileWriter fstream =new FileWriter(f);
			 BufferedWriter out = new  BufferedWriter(fstream);
			 
			 out.write("File writing Example");
			 System.out.println("File Writing");
			 out.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}

	}

}
