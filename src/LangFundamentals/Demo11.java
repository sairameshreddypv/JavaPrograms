package LangFundamentals;

public class Demo11 {
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		demo1.display1(); //Line3
	}
}

class Demo1{
	int a = 11;
	void display1(){
		Demo2 demo2 = new Demo2();
		demo2.display2();
		getValues();
	}
	class Demo2{
		int b =32;
		void display2(){
			System.out.println(a+"");//Line1
		}
	}
	void getValues(){
		System.out.println(b); //Line2
	}
	int b = 78;
}


/*Answer

11
78*/