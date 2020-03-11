package BestPrograms;

import java.util.Date;

public class Demo2 {

}
// select the best defensive copy from below code snippets

//Date dobj1 = new Date();
//Employee e1 = new Employee(d1);
//dobj.setYear(1988);



//class Employee {
//	private final Date doj;
//	Exmployee(Date date){
//		this.doj = new Date(date.getTime());
//	}
//	public Date getDateOfJoining(){
//		return this.doj;
//	}
//}


//Date dobj1 = new Date();
//Employee e1 = new Employee(d1);
//Date dobj2 = e1.getDateOfJoining();
//dobj2setYear(2015);


//class Employee{
//	private final Date doj;
//	Employee(Date date){
//		this.doj = new Date(date.getTime());
//	}
//	public Date getDateOfJoining(){
//		return new Date(this.getDateOfJoining.getTime());
//	}
//}   ----> Answer
