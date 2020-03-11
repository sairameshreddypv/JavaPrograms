package se8features;

public class StaticDemo {
	public static void main(String[] args) {
		new StaticInterfaceImpl().staticMethod();
	}
}
// what is true regarding the following code snippet ?
interface StaticInterface{
	static void staticMethod(){
		System.out.println("inside interface");
	}
}
class StaticInterfaceImpl implements StaticInterface{
	public void staticMethod(){
		System.out.println("inside class");
	}
}

// code will not get compiled as the static method should always be public
// code will not get compiled as the static method is overriden in StaticInterfaceImpl
// code will print " inside interface " on execution
// code will print " inside class" on execution  --> Answer