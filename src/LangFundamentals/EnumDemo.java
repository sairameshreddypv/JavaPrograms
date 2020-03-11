package LangFundamentals;

public class EnumDemo {
	public static void main(String[] args) {
		double re =Fruits.MANGO.calculate(298, 109.78);
		System.out.println(re);
	}

}
enum Fruits {
	APPLE,
	MANGO,
	STRAWBERRY,
	LICHI;
	
	double calculate(double a,double b){
		switch(this){
		case APPLE:
		 return a+b;
		case MANGO:
		return a-b;
		case STRAWBERRY:
		return a*b;
		case LICHI:
			return a/b;
		default:
			throw new AssertionError("Unknown input"+ this);
		}
	}
}

// what code fragment can be inserted at line3 to enable the code to print 188.22

// Answer - 
/*double re =Fruits.MANGO.calculate(298, 109.78);
System.out.println(re);
*/
