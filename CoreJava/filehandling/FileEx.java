package filehandling;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\PRADEEP GOUD\\Desktop\\Hello.txt");
		
		System.out.println(file.exists());
		
		System.out.println(file.createNewFile());
		
		System.out.println(file.exists());
	
		System.out.println("File is created successfully");
	
	}
	
}