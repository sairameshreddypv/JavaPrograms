package DesignPattern;

public class Employee {
	public static Employee C;
	public Employee(){	}

	public static Employee getEmployee(){
		
	}
	if(employeeInstance == null){
	employeeInstance = new Employee();
	}
	return employeeInstance;
}

// None the singeton pattern is properly implemented  --> Answer
// rename employee to instance
// rename getEmployee() to getInstance()
// change the access modifier of employee instance from public to private  
// mark employee final
// Add synchronozed to getEmployee
