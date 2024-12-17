package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		
		FileReader file  = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\Hello.txt");
		
		int value = file.read();
		
		while(value!=-1) {
			System.out.println((char)value);
			value=file.read();
		}
	}//-1 == eod
}
