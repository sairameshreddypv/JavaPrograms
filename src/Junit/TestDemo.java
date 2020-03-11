package Junit;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemo extends MyTest {

	@Test
	public void test1() {
		assertEquals(3,display(1, 2));
	}
}
class MyTest {

	protected int display(int a,int b){
		return a + b;
	}
}