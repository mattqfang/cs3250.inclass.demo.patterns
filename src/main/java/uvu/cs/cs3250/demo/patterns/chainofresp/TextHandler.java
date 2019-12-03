package uvu.cs.cs3250.demo.patterns.chainofresp;

public class TextHandler implements FileHandler {
	@Override
	public boolean open(String filename) {
		if (isTextFile(filename)) {
			//process
			System.out.println("opening text ...");
			return true;
		} else {
			return next().open(filename);
		}
		
	}

	private boolean isTextFile(String filename) {
		return filename.endsWith(".txt");
	}
	
	@Override
	public FileHandler next() {
		return new BinaryHandler();
	}
	
	//-------------------------functional programming------------
	
		@Override
		public boolean canOpen(String filename) {
			return filename.endsWith(".txt");
		}
		
		@Override
		public void openUsingFP(String filename) {
			System.out.println("opening text ...");
		}
}
