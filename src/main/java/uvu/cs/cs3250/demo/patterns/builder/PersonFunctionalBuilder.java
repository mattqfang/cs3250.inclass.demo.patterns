package uvu.cs.cs3250.demo.patterns.builder;

import java.util.function.Consumer;

import uvu.cs.cs3250.demo.patterns.model.Address;
import uvu.cs.cs3250.demo.patterns.model.Person;
import uvu.cs.cs3250.demo.patterns.model.PersonImpl;

public class PersonFunctionalBuilder {
	public String lastName;
	public String firstName;
	public Boolean student;
	public Address address;

	public PersonFunctionalBuilder with(Consumer<PersonFunctionalBuilder> setters) {
		setters.accept(this);
		return this;
	}
	
	public Person build() {
		Person me = new PersonImpl();
		me.setFirstName(this.firstName);
		me.setLastName(lastName);
		me.setStudent(this.student);
		me.setAddress(address);
		return me;
	}
}
