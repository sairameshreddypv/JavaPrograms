package objectoriented;

public class Apple1 implements Fruits {
	public String getName(String name){
		System.out.print("inside Apple1 class");
		return "Fruit from interface is :" +fname + " and fruit from class is :"+name+".";
	}

public static void main(String[] args) {
	Apple1 apple = new Apple1();
	System.out.print(apple.getName("Guava")+"");
	apple.getName("Guava");
}	
}

interface Fruits{
	String fname ="Pomegranate";
	String getName(String name);
}


 /*Answer
 inside Apple1 classFruit from interface is :Pomegranate and fruit from class is :Guava.inside Apple1 class

 */