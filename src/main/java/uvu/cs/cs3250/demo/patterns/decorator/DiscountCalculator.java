package uvu.cs.cs3250.demo.patterns.decorator;

public class DiscountCalculator implements Calculator {
	private double originalPrice;
	
	public DiscountCalculator(double originalPrice) {
		super();
		this.originalPrice = originalPrice;
	}


	@Override
	public double calculate(double discountRate) {
		return originalPrice*(1.0 - discountRate);
	}

}
