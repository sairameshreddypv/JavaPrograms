package se8features;

public class TestDemo implements DefaultMethodInterface1, DefaultMethodInterface2 {
		public static void main(String args[]){
			DefaultMethodInterface1 defMethIn = new TestDemo();
		defMethIn.defaultMethod();
		}
	}

//which will happen when the follwing code is subjected to compliation and execution
interface DefaultMethodInterface1{
	default public void defaultMethod(){
		System.out.println("DefaultMethodInterface1");
	}
}

interface DefaultMethodInterface2(){
	default public void defaultMethod(){
		System.out.println("DefaultMethodInterface2");
	}
}



//a) an exception is thrown at runtime
//b) compilation fails   ---> Answer
//c) defaultMethodInterface1 will get printed on the console
//d) defaultmethodinterface2 will get printed on the console
