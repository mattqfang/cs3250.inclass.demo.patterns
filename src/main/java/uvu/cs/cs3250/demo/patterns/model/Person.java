package uvu.cs.cs3250.demo.patterns.model;

public interface Person {
	String getFirstName();
	void setFirstName(String firstName);
	String getLastName();
	void setLastName(String lastName);
	Boolean isStudent();
	void setStudent(Boolean student);
	Address getAddress();
	void setAddress(Address address);
}
