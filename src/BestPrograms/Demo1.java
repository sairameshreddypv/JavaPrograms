package BestPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		
		String[] customers = new String[]{"John","Jacklin","Jasmine"};
		List customersList = Arrays.asList(customers);
		
		for(Iterator<E> itr= customersList.iterator();itr.hasNext();){
		System.out.println(itr.next());
		//}
}
	
//consider the below code snippet
//
//String[] customers = new String[]{"John","Jacklin","Jasmine"};
//List customersList = Arrays.asList(customers);
//
//select the best code to be used to iterate through the "customerlist" object data


//1) for(Iterator<E> itr= customersList.iterator();itr.hasNext();){
//	System.out.println(itr.next());
//}


//ii) for(String s:customerList){
//	System.out.println(s);
//}

//iii) for(iterator itr = customersList.iterator();itr.next();){
//	System.out.println(itr.next());
//}

//a) Option i only   
//b) Option ii Only
//c) Option i and iii are best
//d) Option iii only  --> Answer