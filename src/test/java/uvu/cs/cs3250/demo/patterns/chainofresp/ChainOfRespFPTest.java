package uvu.cs.cs3250.demo.patterns.chainofresp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class ChainOfRespFPTest {
	private FPClient client;
	
	@Before
	public void setUp() {
		List<FileHandler> handlers = Stream.of(new CSVHandler(), 
				new TextHandler(), 
				new BinaryHandler()).collect(Collectors.toList());
		client = new FPClient().setHandlers(handlers);
		
	}
	@Test
	public void testTextFile() {
		final String filename = "dummy.txt";
		client.open(filename);
	}
	
	@Test
	public void testCSVFile() {
		final String filename = "dummy.csv";
		client.open(filename);
	}
	
	@Test
	public void testWordFile() {
		final String filename = "dummy.doc";
		client.open(filename);
	}
}
