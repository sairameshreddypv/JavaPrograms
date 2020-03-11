package objectoriented;

// Predict the output
public class Student extends Person {

	public Student() { // line 8
		
		System.out.println("inside student");
	}
	public static void main(String[] args) { // Line 11
		new Person("Jacklin");
	}
}

class Person{
	public Person(String name){
		System.out.println(name);
	}
}

// Jacklininside student
// Jacklin
// Compilation fails because of an error in Line 8  --> Answer
//Compilation fails because of an error in Line 11