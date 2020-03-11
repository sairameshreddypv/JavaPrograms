package Junit;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDemo1 {
	static int a = 0;
	static ArrayList b;
	
	@BeforeClass
	public static void beforeClass(){
		a = 10;
		b = new ArrayList();
	}
	@Before
	public void init(){
		a = 15;
		b.add(a);
	}

	@Test
	public void test() {
		a = a + 20;
		System.out.print(a);
		System.out.println(b);
	}
	@Test
	public void test1() {
		a = a + 30;
		System.out.print(a);
		System.out.println(b);
	}

}
