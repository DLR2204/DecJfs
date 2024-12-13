package exceptions;

public class ThrowEx {

	public static void valid(int age) {
		if (age > 18) {
			System.out.println("you are eligible to vote.....");
		}

		else {
			throw new ArithmeticException("age must be greater than 18");
		}

	}
	public static void main(String[] args) {
		
		valid(9);
	}

}
