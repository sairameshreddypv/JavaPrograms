package Gen_Collections;

import java.util.ArrayList;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		ArrayList arrListStr = arrList;
		ArrayList arrListBuf = arrList;
		arrListStr.add(1,"SimpleString");  //Line6
		StringBuffer strBuff = arrListBuf.get(0);  //Line7
		
		System.out.println(strBuff.toString()); // Line 8
	}

}

/* -- choose one option
  SimpleString
  Compilation fails because of an error in line6 and line8
  compilation fails because of an error in line7
  null
  An exception is thrown at runtime

*/

