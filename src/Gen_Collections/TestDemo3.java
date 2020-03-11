package Gen_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList strings = new ArrayList();
		strings.add("aAaA");
		strings.add("AaA");
		strings.add("aAa");
		strings.add("AAaa");
		Collections.sort(strings);
		for(String string: strings){
			System.out.println(string);
		}	
	}
}

/*Compilation fails

aAaA aAa AAaa AaA

AAaa AaA aAa aAaA

AaA AAaa aAaA aAa

An exception is thrown at runtime
*/
