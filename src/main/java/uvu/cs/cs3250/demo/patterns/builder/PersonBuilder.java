package uvu.cs.cs3250.demo.patterns.builder;

import uvu.cs.cs3250.demo.patterns.model.Address;
import uvu.cs.cs3250.demo.patterns.model.Person;
import uvu.cs.cs3250.demo.patterns.model.PersonImpl;

public class PersonBuilder {
	private String lastName;
	private String firstName;
	private Boolean student;
	private Address address;
	
	public PersonBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public PersonBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public PersonBuilder withStudent(Boolean student) {
		this.student = student;
		return this;
	}
	
	public PersonBuilder withAddress(Address address) {
		this.address = address;
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
