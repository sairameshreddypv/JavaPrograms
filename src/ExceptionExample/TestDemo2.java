package ExceptionExample;

public class TestDemo2 {
	
	public static void main(String[] args) {
		int x = 20;
		int y = 2;
		
		try{
			for(int z=4; z>=0;z--){
				int ans = x / z;
				System.out.print(ans+"");
			}
		}catch(Exception e1){
			System.out.println("E1");
		}catch(ArithmeticException e2){
			System.out.println("E2");
		}
	}
}

//Answer - compilation fails
