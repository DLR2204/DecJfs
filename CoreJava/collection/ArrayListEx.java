package collection;

import java.util.ArrayList;

import oops.Employee;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(100,"Ramesh",23423423,"India");
		
		Employee emp2 = new Employee(101,"Suresh",23423423,"India");
		
		Employee emp3 = new Employee(102,"Naresh",23423423,"India");
		
		Employee emp4 = new Employee(103,"Mahesh",23423423,"India");
		
		al.add(emp1);
		
		al.add(emp2);
		
		al.add(emp3);
		
		al.add(emp4);
		
	
		for(Employee emp:al) {
			System.out.println(emp);
		}
		
		
	}

}
