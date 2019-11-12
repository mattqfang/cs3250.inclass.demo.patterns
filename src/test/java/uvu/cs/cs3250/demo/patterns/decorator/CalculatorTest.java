package uvu.cs.cs3250.demo.patterns.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testSimpleCase() {
		double unit = 3.0;
		double unitPrice = 2.0;
		double taxRate = 0.05;
		
		VolumeCalculator vc = new VolumeCalculator(unitPrice);
		double total = vc.calculate(unit);
		TaxCalculator tc = new TaxCalculator(total);
		double cost = tc.calculate(taxRate);
		
		System.out.println(cost);
	}

	@Test
	public void testWithDiscount() {
		double unit = 3.0;
		double unitPrice = 2.0;
		double taxRate = 0.05;
		double discountRate = 0.5;
		
		VolumeCalculator vc = new VolumeCalculator(unitPrice);
		double total = vc.calculate(unit);
		DiscountCalculator dc = new DiscountCalculator(total);
		double afterDisount = dc.calculate(discountRate);
		TaxCalculator tc = new TaxCalculator(afterDisount);
		double cost = tc.calculate(taxRate);
		
		System.out.println(cost);
	}
	
	@Test
	public void testFunctionalCalc() {
		double unit = 3.0;
		double unitPrice = 2.0;
		double taxRate = 0.05;
		double discountRate = 0.5;
		
		FunctionalCalculator fc = new FunctionalCalculator(unitPrice, discountRate, taxRate);
		List<Function<Double, Double>> calculators = Stream.of(fc.VOLUME_CALC, fc.DISCOUNT_CALC, fc.TAX_CALC)
															.collect(Collectors.toList());
		double cost = fc.calculate(unit, calculators);
		System.out.println(cost);
	}
}
