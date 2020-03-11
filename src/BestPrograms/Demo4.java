package BestPrograms;

import java.util.Random;

public class Demo4 {
	
	private static String id;
	private Random random = new Random();
	public Demo4(){
		// Line5
		id="ACC1101"+Math.abs(random.nextInt());
	}
}
public String getId(){
	Return id;
}
}

identify the valid code to be inserted at line5 . assume the code is running in multithread environment

i) if(id==null)
	
ii) synchronized(this){
	if(id==null){

iii)if(id==null){synchronized(this)	{
	
iv) synchronized(if(id==null)){
	
}
}
		