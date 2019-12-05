package uvu.cs.cs3250.demo.patterns.command;

import java.util.Arrays;
import java.util.List;

public class TaskExecutor {
	private List<Task> tasks;
	
	public static void main(String[] args) {
		TaskExecutor.run(
				new SaveTask("matt is great"),
				new CloseTask(),
				new EmailTask("notification email sent"));
		
//		TaskExecutor.run(
//				Stream.<Task>of(new EmailTask("notification email sent"),
//						new SaveTask("matt sucks"),
//						new CloseTask()).collect(Collectors.toList()));
		
//		EmailTask emailTask = new EmailTask("notification email sent");
//		CloseTask closeTask = new CloseTask();
//		SaveTask saveTask = new SaveTask("matt is great");
//		
//		TaskExecutor executor = new TaskExecutor();
//		executor.tasks = new ArrayList<>();
//		executor.tasks.add(saveTask);
//		executor.tasks.add(closeTask);
//		executor.tasks.add(emailTask);
//		
//		executor.execute();
	}
	
	public static TaskExecutor getInstance(List<Task> tasks) {
		return new TaskExecutor(tasks);
	}
	
	private TaskExecutor(List<Task> tasks) {
		super();
		this.tasks = tasks;
	}


	private void execute() {
		tasks.forEach(t -> t.execute());
	}
	
	public static void run(Task... tasks) {
		new TaskExecutor(Arrays.asList(tasks)).execute();
	}
	
//	private TaskExecutor setTaskList(List<Task> tasks) {
//		this.tasks = tasks;
//		return this;
//	}
	
	

}
