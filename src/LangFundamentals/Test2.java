package LangFundamentals;

public class Test2 {
	
	public static void main(String[] args) {
		int [][] x;
		x = new int[3][4];
		for(int i = 0; i < 3; i+=2){
			for(int j=0; j < 4 ; j++){
				x[i][j] = i + j ;
				System.out.print(x[i][j]+"");
			}
		}
	}

}

// Answer - 01232345