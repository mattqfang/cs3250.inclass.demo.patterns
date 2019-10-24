package uvu.cs.cs3250.demo.patterns.builder;

import java.util.function.Consumer;

import uvu.cs.cs3250.demo.patterns.model.Address;
import uvu.cs.cs3250.demo.patterns.model.AddressImpl;

public class AddressBuilder {
	public String city;
	public String state;
	public String zip;
	
	public AddressBuilder with(Consumer<AddressBuilder> setters) {
		setters.accept(this);
		return this;
	}
	
	public Address build() {
		Address addr = new AddressImpl();
		addr.setCity(this.city);
		addr.setState(this.state);
		addr.setZip(this.zip);
		return addr;
	}
}
