package intro;

public class ConstructorEx {

	public ConstructorEx() {
		System.out.println("6.Iam from the default constructor");
	}
	
	public ConstructorEx(String name) {
		System.out.println("10.The name is :- "+name);
	}
	
	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx("ElonMusk");
	}
}
