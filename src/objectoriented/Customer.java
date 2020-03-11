package objectoriented;

public class Customer {

}
// given an abstract class customer below

public abstract class Customer{
	public abstract String getCutomerType();
}

// Select a valid implementation of getCustomer Type method in another class, from the below options

/*abstract class C1 extends Customer {
	public String getCustomerType(){
		return "Premium";
	}
}*/
// secon option
/*Customer customer = new Customer(){
	public String getCustomerType(){
		return "Premium";
	}
};*/

// Option 3

/*class C1 extends Customer {
	public String getCustomerType(){
		return "Premium";
		
	}
}*/

// Option 4
/*new Customer(){
	public String getCustomerType(){
		return "Premium";
	}
}*/