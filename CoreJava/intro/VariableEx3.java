package intro;

public class VariableEx3 {

	static String nationality = "Indian";
	
	int aadhar;
	
	public String display() {
		
	return "The Nationality :- "+nationality +"\t"+"Aadhar number is :-"+aadhar;
	}
	
	public static void main(String[] args) {
		
		VariableEx3 Ramesh = new VariableEx3();
		
		VariableEx3 Suresh = new VariableEx3();
		
		VariableEx3 Naresh = new VariableEx3();
		
		Ramesh.aadhar = 1 ;Suresh.aadhar = 2 ;
		 Naresh.aadhar = 3;
		 
		 
		System.out.println("Ramesh :- " +Ramesh.display());
		
		System.out.println("Suresh :- " +Suresh.display());
		
		System.out.println("Naresh :- " +Naresh.display());
		
	}
}
