package uvu.cs.cs3250.person.service;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import uvu.cs.cs3250.demo.patterns.factory.PersonFactory;
import uvu.cs.cs3250.demo.patterns.model.Person;

public interface PersonService {
	static final Supplier<List<Person>> getPersons = () -> {
		return Stream.of(PersonFactory.getInstance("matt", "fang"),
				         PersonFactory.getInstance("john", "doe"))
				.collect(Collectors.toList());
	};
	
//	public static List<Person> getPersons() {
//		return Stream.of(PersonFactory.getInstance("matt", "fang"),
//		         PersonFactory.getInstance("john", "doe"))
//		.collect(Collectors.toList());
//	}
//	
	static final Function<String, Person> findPersonByLastName = last -> {
		return getPersons.get()
				.stream()
				.filter(p -> p.getLastName().equalsIgnoreCase(last))
				.findAny()
				.orElse(null);
	};
	
//	public static Person findPersonByLastName(String name) {
//		return getPersons()
//				.stream()
//				.filter(p -> p.getLastName().equalsIgnoreCase(name))
//				.findAny()
//				.orElse(null);
//	}
	
	static final Function<Person, String> getName = p -> p.getFirstName() + " " + p.getLastName();
	
//	public static String getName(Person person) {
//		return person.getFirstName() + " " + person.getLastName();
//	}
	
	static final Function<String, String> formatNameToCaps = n -> n.toUpperCase();
	
//	public static String formatNameToCaps(String name) {
//		return name.toUpperCase();
//	}
}
