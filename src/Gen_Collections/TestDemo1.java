package Gen_Collections;

import java.util.*;
import java.util.Set;

public class TestDemo1 {

	public static  void main(String[] args) {
		HashMap props = new HashMap<>();
		props.put("key45", "some value");
		props.put("key12", "some other value");
		props.put("key39", "yet another value");
		
		Set s = props.keySet();
		s = new TreeSet(s);
		System.out.println(s);

	}
}

/*which of the below code has to be inserted at Line1, to sort the keys in the props HashMap variable?

Arrays.sort(s);

s = new TreeSet(s); --> Answer

Collections.sort(s);

s = new SortedSet(s);
*/