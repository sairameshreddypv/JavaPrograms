package LangFundamentals;


/*select the suitable code to be inserted in Line1 and Line2 to get the below output. Line2 should be used to change the space into tab space

false
sample
demo
for
regular
expressions
using
pattern
matching
Simple   demo     for regular expressions using pattern matching.*/

public class RegExDemo1{
	public static final String string1 = "Simple demo for"
			+"regular expressions"+"using pattern matching";
	
	public static void main(String[] args) {
		System.out.println(string1.matches("\\r"));
		String[] splitString = (string1.split("\\s"));
		for(String string: splitString){
			System.out.println(string);
		}
		System.out.println(string1.replace("\\s+","\t"));
		
	}
}
		
/*// Option3
System.out.println(string1.matchAll("\\r"));
String[] splitString = (string1.split("\s"));
for(String string: splitString){
	System.out.println(string);
}
// System.out.println(string1.replace("\\s+","\t"));
}
}
*/

