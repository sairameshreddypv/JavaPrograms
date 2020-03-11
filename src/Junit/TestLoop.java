package Junit;
import org.junit.Test;

import junit.framework.Assert;

public class TestLoop {

	LoopDemo  tc = new LoopDemo();
	char value;
	
	@Test
	public void display(){
		Assert.assertSame(tc.display(70), 'B');
		//Line 1
		
		// Option1 - fail
//				Assert.assertSame(tc.display(88), 'A');
//				Assert.assertSame(tc.display(64), 'F');
//				Assert.assertNotSame(tc.display(100), 'F');
		
		// options 2 - pass (Answer)
//		Assert.assertSame(tc.display(88), 'A');
//		Assert.assertSame(tc.display(64), 'F');
		
		
		// option 4 - fail
//		Assert.assertSame(tc.display(85), 'B');
//		Assert.assertSame(tc.display(64), 'F');
//		Assert.assertSame(tc.display(74), 'A');
		

		// option 3 - pass
//		Assert.assertSame(tc.display(85), 'A');
//		Assert.assertSame(tc.display(64), 'F');
//		Assert.assertSame(tc.display(84), 'B');
	
		
	}
	
}
