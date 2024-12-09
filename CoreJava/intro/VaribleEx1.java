package intro;

public class VaribleEx1 {

	static int staticCounter;  //static Global variable

	int instanceCounter;        //instance global variable

	public void counter() {

		staticCounter++; // staticCounter = staticCounter+1

		instanceCounter++;
	}

	public void display() {

		System.out.println("Static Counter :- " + staticCounter);

		System.out.println("Instance Counter:- " + instanceCounter);
	}

	public static void main(String[] args) {

		VaribleEx1 obj1 = new VaribleEx1();

		VaribleEx1 obj2 = new VaribleEx1();

		VaribleEx1 obj3 = new VaribleEx1();
		
		
		obj1.counter();
		
		obj2.counter();
		
		obj3.counter();
		
		
		obj3.display();

	}

}
