package uvu.cs.cs3250.demo.patterns.decorator;

public class VolumeCalculator implements Calculator {
	private double unitPrice;
	
	public VolumeCalculator(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public double calculate(double volume) {
		return unitPrice*volume;
	}

}
