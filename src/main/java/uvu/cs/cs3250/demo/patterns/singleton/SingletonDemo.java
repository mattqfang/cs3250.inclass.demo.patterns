package uvu.cs.cs3250.demo.patterns.singleton;


public class SingletonDemo {
	
	private static SingletonDemo instance;
	
	private SingletonDemo() {

	}
	
	public static SingletonDemo getInstance() {
		if (instance == null) {
			instance = new SingletonDemo();
		}
		
		return instance;
	}
}
