package collection;
//order :- random order
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(1234);

		hs.add(3.14f);

		hs.add("apple");

		hs.add(true);

		hs.add('f');

		hs.add(1234);

		hs.add(3.14f);

		hs.add("apple");

		hs.add(true);

		hs.add('f');

		System.out.println(hs);
	}
}
