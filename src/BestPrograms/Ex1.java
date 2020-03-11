package BestPrograms;
public class Ex1 {
	public String formatInput(String i){
		if(i.trim().length()==9){
			StringBuilder s1 = new StringBuilder();
			s1 = s1.insert(0, "+1(");
			s1 = s1.insert(6, ")");
			s1 = s1.insert(10, "-");
			return s1.toString();
		}
		return null;
	}
	public static void main(String args[]){
		Ex1 ob = new Ex1();
		String i;
		ob.formatInput(i);
	}
}

// Compilation  fails at Line 3
// Compilation fails at Line 6
// Null Pointer exception will be thrown if the value of i is null  --> Answer
// Compilation fails due to error in Line7