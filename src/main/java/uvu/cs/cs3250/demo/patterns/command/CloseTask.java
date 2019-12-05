package uvu.cs.cs3250.demo.patterns.command;

public class CloseTask implements Task {
	@Override
	public void execute() {
		System.out.println("closing DB...");

	}

}
