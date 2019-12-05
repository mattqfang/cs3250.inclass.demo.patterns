package uvu.cs.cs3250.demo.patterns.command;

public class SaveTask implements Task {
	private String message;
	
	public SaveTask(String message) {
		super();
		this.message = message;
	}


	@Override
	public void execute() {
		System.out.println("saving to DB with the message: " + this.message);

	}

}
