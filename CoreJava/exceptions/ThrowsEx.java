package exceptions;

import java.io.FileNotFoundException;

public class ThrowsEx {
	
	public static void div(int a,int b) throws FileNotFoundException{
		System.out.println("The division result is:- "+(a/b));
	}

	public static void main(String[] args) {
		
		try {
			div(0,0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
