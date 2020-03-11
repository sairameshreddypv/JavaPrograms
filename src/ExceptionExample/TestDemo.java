package ExceptionExample;

public class TestDemo {
	
	public static void main(String[] args) {
		Class c = Class.forName("TestDemo");  // Line1
	}

}

// in the above code snippet Line1 gives a compilation error that says ' unhandled Exception Type ClassNotFoundException' what is the reason
// behind this compilation error 

// class does not have a method named "forName"

// unused variable 'c'

// Try and catch block is must when a variable is declared of type Class

// ClassNotFoundException is checked exception hence it must be compulsarily handle  --> Answer


