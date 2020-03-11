package se8features;

public class InterfaceWithDefaultMethod implements DefaultExtend{
	public static void main(String[] args) {
		InterfaceWithDefaultMethod defaultExtend = new InterfaceWithDefaultMethod(); // Line4
				defaultExtend.method1();// Line5
	}
}

// refer the below code snippet and predict the outcome ?
interface interface1 {
	default void method1(){
		System.out.println("inside default method");
	}
}

interface DefaultExtend extends interface1{
	default void method1(){
		System.out.println("Default method redefined");
	}
}

// inside default method
// default method redefined  --- >correct answer
// compilation fails at line 5
// runtime exeception will be thrown at line 5