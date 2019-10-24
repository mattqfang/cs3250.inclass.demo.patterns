package uvu.cs.cs3250.demo.patterns.factory;

import uvu.cs.cs3250.demo.patterns.model.Person;
import uvu.cs.cs3250.demo.patterns.model.PersonImpl;
import uvu.cs.cs3250.demo.patterns.model.StudentImpl;

public interface PersonFactory {
	static Person getInstance( ) {
		return new PersonImpl();
	}
	
	static Person getInstance(String firstName, String lastName) {
		Person p = getInstance();
		p.setFirstName(firstName);
		p.setLastName(lastName);
		return p;
	}
	
	static Person getStudent(String firstName, String lastName) {
		Person me = new StudentImpl();
		me.setFirstName(firstName);
		me.setLastName(lastName);
		return me;
	}
}
