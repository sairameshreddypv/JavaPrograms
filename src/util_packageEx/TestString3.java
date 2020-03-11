package util_packageEx;

public class TestString3 {
	
	public static void main(String[] args) {
		// insert code here // Line 3
		StringBuffer s = new StringBuffer("123456789"); s.delete(0 , 3).replace(1, 3, "98").delete(3 , 8);
		System.out.println(s);
	}

}

//which of the below code fragment when inserted independently at line 3 generate the output 498? 

// StringBuffer s = new StringBuffer("123456789"); s.delete(0 , 3).replace(1, 3, "98").delete(3 , 8);  ---> Answer

