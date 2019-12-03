package uvu.cs.cs3250.demo.patterns.chainofresp;

public interface FileHandler {
	boolean open(String filename);
	FileHandler next();
	//---------------for functional programming
	boolean canOpen(String fileName);
	void openUsingFP(String filename);
	
}
