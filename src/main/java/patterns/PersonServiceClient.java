package patterns;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import uvu.cs.cs3250.demo.patterns.model.Person;
import uvu.cs.cs3250.person.service.PersonService;

public class PersonServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person me = PersonService.findPersonByLastName("fang");
//		String name = PersonService.getName(me);
//		String capName = PersonService.formatNameToCaps(name);
		
		String name = PersonService.formatNameToCaps(
													PersonService.getName(
																	     PersonService.findPersonByLastName("fang")));
		String name = PersonService.findPersonByLastName
									.andThen(PersonService.getName)
									.andThen(PersonService.formatNameToCaps)
									.apply("fang");
		
		
		Person me = PersonService.findPersonByLastName.apply("fang");
		String name = PersonService.getName.apply(me);
		String capName = PersonService.formatNameToCaps.apply(name);
		System.out.print(capName);
		
//		Stream.of(PersonService.findPersonByLastName,
//				  PersonService.getName,
//				  PersonService.formatNameToCaps)
//				.reduce(Function.identity(),Function::andThen).apply("fang");
				
		
		
	}

}
