package uvu.cs.cs3250.demo.patterns.factory;

import uvu.cs.cs3250.demo.patterns.builder.AddressBuilder;
import uvu.cs.cs3250.demo.patterns.builder.PersonBuilder;
import uvu.cs.cs3250.demo.patterns.builder.PersonFunctionalBuilder;

public interface BuilderFactory {
	static PersonBuilder getPersonBuilder() {
		return new PersonBuilder();
	}
	
	static PersonFunctionalBuilder getPersonFunctionalBuilder() {
		return new PersonFunctionalBuilder();
	}
	
	static AddressBuilder getAddressBuilder() {
		return new AddressBuilder();
	}
}
