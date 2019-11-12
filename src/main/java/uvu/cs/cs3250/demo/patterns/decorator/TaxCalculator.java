package uvu.cs.cs3250.demo.patterns.decorator;

public class TaxCalculator implements Calculator {
private double originalPrice;
	
	public TaxCalculator(double originalPrice) {
		super();
		this.originalPrice = originalPrice;
	}


	@Override
	public double calculate(double taxRate) {
		return originalPrice*(1.0 + taxRate);
	}

}
