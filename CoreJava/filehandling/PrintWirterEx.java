package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWirterEx {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Hello.txt");
	
		pw.println(1234);
		
		pw.println(true);
		
		pw.println(3.14f);
		
		pw.println("Good Morning");
		
		pw.flush();
		
		pw.close();
		
		System.out.println("File is written successfully");
	}
}
