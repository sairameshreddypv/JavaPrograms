package BestPrograms;

public class TestDemo {
	public static Object staticObject;
	
	private static Object createStaticObject(){
		if(staticObject == null){
			staticObject = new Object();
		}
		return staticObject;
		}
}
// what changes are required in the above code for successfull execution
// 
// The method createStaticObject should be synchronized
// The method createstaticObject should be private  --> Answer
// The staticObject reference should not be static
// The method createStaticObject should not return Object type
//		 