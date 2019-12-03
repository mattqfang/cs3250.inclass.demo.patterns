package uvu.cs.cs3250.demo.patterns.chainofresp;

public class CSVHandler implements FileHandler {
	
	@Override
	public boolean open(String filename) {
		if (isCSVFile(filename)) {
			//process
			System.out.println("opening csv ...");
			return true;
		} else {
			System.out.println("not supported...");
			return false;
		}
	}

	private boolean isCSVFile(String filename) {
		return filename.endsWith(".csv");
	}

	@Override
	public FileHandler next() {
		return null;
	}
	
	//-------------------------functional programming------------
	
		@Override
		public boolean canOpen(String filename) {
			return filename.endsWith(".csv");
		}
		
		@Override
		public void openUsingFP(String filename) {
			System.out.println("opening csv ...");
		}
}
