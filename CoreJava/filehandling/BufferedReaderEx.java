package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader file  = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\DailyNotesDec.txt");
		
		BufferedReader br = new BufferedReader(file);
		
		String value = br.readLine();
		
		while(value!=null) {
			System.out.println(value);
			
			value = br.readLine();
		}
		
	}
}
