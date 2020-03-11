package objectoriented;

public class Demo2 {

	public static void main(String[] args) {
		Book2 book2 = new Book2();
		book2.display();
	}
}

class Book{
	int bookId = 2356;
}
class Book1 extends Book{
	int bookId = 1167;
}
class Book2 extends Book1 {
	int bookId = 2378;
	void display(){
		System.out.println(super.super.bookId);  // Line 10
		System.out.println(super.bookId);  // Line 11
		System.out.println(bookId); 
	}
}

// compilation fails because of an error in Line 10  --> Answer
// compilation fails because of an error in Line 11
// compiler error since Book1 cannot define a varaible("bookId") with the same name as that of Book
// Code runs and gives output 2356 1167 2378