package uvu.cs.cs3250.demo.patterns.chainofresp;

public interface FileHandler {
	boolean open(String filename);
	FileHandler next();
}
