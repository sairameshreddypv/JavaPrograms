package util_packageEx;

public class TestDemo {
	public static void main(String[] args) {
		Integer n1 = new Integer(100);
		Integer n2 = new Integer(100);
		Integer n3 = 127;
		Integer n4 = 127;
		Integer n5 = 128;
		Integer n6 = 128;
		int n7 = 129;
		int n8 = 129;
		
		System.out.print(n1 == n2);
		System.out.print(n3 == n4);
		System.out.print(n5 == n6);
		System.out.print(n7 == n8);		
	}
}
// Answer - falsetruefalsetrue
