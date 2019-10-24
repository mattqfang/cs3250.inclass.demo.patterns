package patterns;

import uvu.cs.cs3250.demo.patterns.builder.PersonBuilder;
import uvu.cs.cs3250.demo.patterns.factory.BuilderFactory;
import uvu.cs.cs3250.demo.patterns.factory.PersonFactory;
import uvu.cs.cs3250.demo.patterns.model.Person;

public class PatternDemo {

	public static void main(String[] args) {
		// factory
//		Person p = PersonFactory.getStudent("matt", "fang");
//		System.out.println("I am " + p.getFirstName() + " " + p.getLastName());
//		if (p.isStudent() == null) {
//			System.out.println("I am not sure if I am a student.");
//		} else {
//			System.out.println("I am a student.");
//		}
		
		//builder
//		Person matt = BuilderFactory.getPersonBuilder()
//				.withFirstName("matt")
//				.withLastName("fang")
//				.build();
		
		//FunctionalBuilder
		Person matt = BuilderFactory.getPersonFunctionalBuilder()
				.with($ -> {
					$.firstName = "matt";
					$.lastName = "fang";
					$.address = BuilderFactory.getAddressBuilder()
										.with($_addr -> {
											$_addr.city = "salt lake";
										}).build();
				}).build();
		
		System.out.println(matt.getFirstName());
		System.out.println(matt.getLastName());
	}

}
