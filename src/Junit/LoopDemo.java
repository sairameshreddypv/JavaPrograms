package Junit;

public class LoopDemo {

	public char display(int marks) {
		if(marks >= 85 && marks < 99){
			return 'A';
		}else if (marks >= 65 && marks <=84) {
			return 'B';
		}else {
			return 'F';
		}
	}
}
