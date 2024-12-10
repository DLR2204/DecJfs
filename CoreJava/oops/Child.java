package oops;

class GrandParent{
	public void hi() {
		System.out.println("Iam from the Grand Parent class");
	}
}

class Parent extends GrandParent{
	public void display() {
		System.out.println("Iam from the parent class");
	}
	
	public int add(int a,int b) {
		return (a+b);
	}
}

public class Child extends Parent{

	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.display();
		
		obj.hi();
		
	}
	
}
