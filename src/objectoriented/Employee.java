package objectoriented;

public class Employee {
		double salary;
	public static void main(String[] args) {
		Employee employee1 = null;
		Employee employee2 = null;
		employee1 = new Employee();
		employee2 = new Employee();
		employee2 = employee1;
		employee1 = new Employee();
		
		Employee employee3 = employee1;
		employee1 = employee3 = null;// Line 8
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
				System.out.println("Hello world");
		// how many objectsnare eligible for garbage collection after execution of Line 8 ?
		/*Option A = 3;
		Option A = 0;
		Option A = 2;
		Option A = 1;*/
				
				
	}
}
