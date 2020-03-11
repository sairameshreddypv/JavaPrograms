package DesignPattern;

import java.text.NumberFormat;
import java.util.Locale;

public class FindDesign {
	public static void main(String args[]){
	
	Locale locale = new Locale("da","DK");
	NumberFormat numberFormat = NumberFormat.getInstance(locale);
	String number = numberFormat.format(100.99);
	System.out.println(number);
}
}
// Factory method pattern - PASS
// singleton pattern
// Abstract Factory pattern
// Builder pattern