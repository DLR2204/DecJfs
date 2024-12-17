package collection;

import java.util.LinkedHashSet;
//order :- insertion order
public class LinkedHashSetEx {
	
	public static void main(String[] args) {

		LinkedHashSet lhs  = new LinkedHashSet();
		
		lhs.add(1234);

		lhs.add(3.14f);

		lhs.add("apple");

		lhs.add(true);

		lhs.add('f');

		lhs.add(1234);

		lhs.add(3.14f);

		lhs.add("apple");

		lhs.add(true);

		lhs.add('f');

		System.out.println(lhs);
	}
}
