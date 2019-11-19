package uvu.cs.cs3250.demo.patterns.chainofresp;

import org.junit.Test;

public class ChainOfRespTest {
	@Test
	public void testTextFile() {
		final String filename = "dummy.txt";
		FileHandler handler = new TextHandler();
		handler.open(filename);
	}
	
	@Test
	public void testCSVFile() {
		final String filename = "dummy.csv";
		FileHandler handler = new TextHandler();
		handler.open(filename);
	}
	
	@Test
	public void testWordFile() {
		final String filename = "dummy.doc";
		FileHandler handler = new TextHandler();
		handler.open(filename);
	}
}
