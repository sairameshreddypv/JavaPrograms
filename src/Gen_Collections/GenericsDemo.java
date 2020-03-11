package Gen_Collections;

public class GenericsDemo {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Annie Thomas",25);
		employee.display();
	}
}

class Employee<E, A>{
	E eObj1;
	A aObj1;
	Employee(E eObj1,A aObj1){
		this.eObj1 = eObj1;
		this.aObj1 = aObj1;
	}
	public void display(){
		System.out.println(eObj1);
		System.out.println(aObj1);
	}
}

/*result

Annie Thomas
25*/

