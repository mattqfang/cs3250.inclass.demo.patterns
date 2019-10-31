package uvu.cs.cs3250.demo.patterns.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingletonDemoTest {
	@Test
	public void testSingleton( ) {
		SingletonDemo obj1 = SingletonDemo.getInstance();
		SingletonDemo obj2 = SingletonDemo.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		assertTrue(obj1 == obj2);
	}
	
	
}
