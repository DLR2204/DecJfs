package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Hello.txt");

		BufferedWriter bw = new BufferedWriter(file);

		bw.write(1234);
		bw.newLine();
		bw.write("Good Morning");

		bw.newLine();
		bw.write('c');
		bw.newLine();
		bw.flush();

		bw.close();

		System.out.println("File is written successfully");

		// boolean,float's are not allowed
		// cant read's int values
		
	}

}
