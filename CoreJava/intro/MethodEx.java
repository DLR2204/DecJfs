package intro;

public class MethodEx {
	
	public void display() {				//dynamic
		
		System.out.println("Hello Everyone.....");
	}
	
	
	public static int add(int a,int b) {			//static
		return (a+b);
	}

	public static void main(String []args) {
		
		MethodEx obj = new MethodEx();
		
		obj.display();
		
		System.out.println(add(2,4));
		
	}
}
