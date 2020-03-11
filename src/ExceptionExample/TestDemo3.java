package ExceptionExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemo3 {
	
	public static void main(String[] args) {
		try{
			checkName("TioT");
		}catch(Exception r){
			System.out.println("Exception 1");
		}
	}
	static void checkName(String name){
		Pattern regex = Pattern.compile("T[aei]{3}T");
		Matcher mobileMatcher = regex.matcher(name);
		try{
			if(mobileMatcher.matches() == false){
				throw new RuntimeException("Name is invalid");
			}else
				System.out.println("Name is valid");
		}catch(NullPointerException r){
			System.out.println("Exception 2");
		}
	}

	// Answer - Exception 1
}
