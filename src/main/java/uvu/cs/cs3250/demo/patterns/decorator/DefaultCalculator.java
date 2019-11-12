package uvu.cs.cs3250.demo.patterns.decorator;

public class DefaultCalculator implements Calculator {

	@Override
	public double calculate(double number) {
		return number;
	}

}
