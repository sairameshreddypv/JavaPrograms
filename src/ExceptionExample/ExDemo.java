package ExceptionExample;

public class ExDemo {
	public static void main(String[] args) {
		try{
			throw 110;
		}
		catch(int ex){
			System.out.println("Caught Exception"+ ex);
		}
	}
}

// caught the exception as 10

// caught the exception as 0

// compilation fails   --> Answer

// An excepiton is thrown at runtime

