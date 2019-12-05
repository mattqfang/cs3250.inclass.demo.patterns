package uvu.cs.cs3250.demo.patterns.command;

public class EmailTask implements Task {
	private String message;
	
	
	public EmailTask(String message) {
		super();
		this.message = message;
	}


	@Override
	public void execute() {
		System.out.println("sending email with the message: " + this.message);

	}

}
