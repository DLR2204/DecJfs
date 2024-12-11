package oops;

class Parent3 {

	public void display() {
		System.out.println("Iam from the parent class");
	}

	public void marriage() {

		System.out.println("The girl is Kajol");
	}

}

public class MethodOverriding extends Parent3 {

	public static void main(String[] args) {

		MethodOverriding obj = new MethodOverriding();

		obj.display();

		obj.marriage();
	}
	
	@Override
	public void marriage() {

		System.out.println("The girl is DEEPIKA");
	}
}
