package uvu.cs.cs3250.demo.patterns.model;

public class PDF implements Document {
	private String fileName;
	
	public PDF(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public String getFileName() {
		return fileName;
	}

	@Override
	public void open() {
		System.out.println("open the PDF "+fileName);

	}

	@Override
	public void close() {
		System.out.println("close the PDF " + fileName);

	}

	@Override
	public void view() {
		System.out.println("you are viewing the PDF " + fileName);

	}

	@Override
	public void delete() {
		System.out.println("you are about to delete the PDF " + fileName);

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
