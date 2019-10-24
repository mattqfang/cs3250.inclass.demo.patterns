package uvu.cs.cs3250.demo.patterns.model;

public class PersonImpl implements Person {
	private String firstName;
	private String lastName;
	private Boolean student;
	private Address address;
	
	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	@Override
	public Boolean isStudent() {
		// TODO Auto-generated method stub
		return student;
	}
	
	@Override
	public void setStudent(Boolean student) {
		this.student = student;
	}

	@Override
	public Address getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public void setAddress(Address address) {
		this.address = address;
		
	}
	
	

}
