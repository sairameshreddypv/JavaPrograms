package ExceptionExample;

public class TestDemo1 {

	public static void main(String[] args) {
		try{
			int a = 20 / 20;
			int b = 20 / 10;
			System.out.println("a="+ a + "b=" +b);
			try{
				if(a == 1){
					a = a /(a -a);
				}if(b == 2){
					int c[] = { 1 };
					c[22] = 99;
				}
			}
			catch(ArithmeticException ae){
				System.out.println("EX1");
			}catch(ArrayIndexOutOfBoundsException ai){
				System.out.println("EX2");
			}
		}
		catch(ArithmeticException ae){
			System.out.println("EX3");
		}
	}
}

// answer
/*a=1b=2
EX1
*/