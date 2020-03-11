package objectoriented;

// Predict the output of the following code
public class VarArgsDemo {

	static void func(int ...x)
	{
		System.out.println("Number of arguments" + x.length);
		
		for(int i:x)
			System.out.println(i+"");
		System.out.println();
	}
	void fun(int a){  //Line 1
		System.out.println("one");
	}
	public static void main(String[] args) {
		new VarArgsDemo().fun(150);
		func(11,12,13,14);
		func();
	}
}
/*Answer
one
Number of arguments4
11
12
13
14

Number of arguments0*/