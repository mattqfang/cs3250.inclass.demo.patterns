package uvu.cs.cs3250.demo.patterns.chainofresp;

public class BinaryHandler implements FileHandler {
	@Override
	public boolean open(String filename) {
		if (isBinaryFile(filename)) {
			//process
			System.out.println("opening binary ...");
			return true;
		} else {
			return next().open(filename);
		}
		
	}

	private boolean isBinaryFile(String filename) {
		return filename.endsWith(".bin");
	}
	
	@Override
	public FileHandler next() {
		return new CSVHandler();
	}
	
	//-------------------------functional programming------------
	
	@Override
	public boolean canOpen(String filename) {
		return filename.endsWith(".bin");
	}
	
	@Override
	public void openUsingFP(String filename) {
		System.out.println("opening binary ...");
	}
}
