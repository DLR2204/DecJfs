package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Hello.txt");
	
		file.write(1234);
		
		file.write("Good Morning");
		
		file.write('c');
		
		file.flush();
		
		file.close();
		
		System.out.println("File is written successfully");
		
		
		
	
	//boolean,float's are not allowed
	//cant read's int values
	//no new line option.
	}
}
