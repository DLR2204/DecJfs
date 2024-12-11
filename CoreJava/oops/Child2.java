package oops;

interface Parent1 {
	public int add(int a, int b);

	public void display();

}

interface Parent2 {
	public int add(int a, int b);

	public void display();

}

public class Child2 implements Parent1,Parent2 {

	@Override
	public int add(int a, int b) {
	
		return (a+b);
	}

	@Override
	public void display() {
		System.out.println("Hi everyone");
		
	}

	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		obj.display();
		
		System.out.println(obj.add(45, 5));
	}

}
