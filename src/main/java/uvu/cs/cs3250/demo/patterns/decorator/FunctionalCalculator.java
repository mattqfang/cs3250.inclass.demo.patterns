package uvu.cs.cs3250.demo.patterns.decorator;

import java.util.List;
import java.util.function.Function;

public class FunctionalCalculator {
	private Double unitPrice;
	private Double discountRate;
	private Double taxRate;
	
	public final Function<Double, Double> VOLUME_CALC = n -> n * unitPrice;
	public final Function<Double, Double> DISCOUNT_CALC = t -> t * (1.0 - discountRate);
	public final Function<Double, Double> TAX_CALC = t -> t * (1.0 + taxRate);
	
	public Double calculate(Double another, List<Function<Double, Double>> calculators) {
		return calculators.stream().reduce(Function.identity(), Function::andThen).apply(another);
	}

	public FunctionalCalculator(Double unitPrice, Double discountRate, Double taxRate) {
		super();
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
	}

}
