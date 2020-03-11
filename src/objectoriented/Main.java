package objectoriented;

public class Main(){
	public static void main(String args[]){
		Apple apple  = new Apple();
		apple.display();
	}
}

class Apple {
	
	private Apple(){ //Line1
		System.out.println("Apple Constructor");
	}
	void display(){
		System.out.println("Hello world");
	}

}
// Answer
// Unresolved compilation Problem . The constructor Apple() is not visible
