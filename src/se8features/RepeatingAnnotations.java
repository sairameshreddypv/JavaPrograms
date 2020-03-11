package se8features;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

public class RepeatingAnnotations {
	
	@Retention(RepeatingPolicy.RUNTIME)
	public @interface Chocolates(){
		Favourite[] value() default{};
	}
	@Favourite("Dairy Milk")
	@Favourite("Kit Kat")
	@Favourite("5 Star")
	@Favourite("Galaxy")
	
	public interface Chocolate{
		
	}
	@Repeatable(value = Chocolate.class)
	public @interface Favourite{
		String value();
	}
	
	public static void main(String[] args) {
		Favourite[] a = Chocolate.class.getDeclaredAnnotationsByType(Favourite.class);
		for(Favourite favourite: chocolates.value()){
			System.out.println(favourite.value());
		}
	}

}
