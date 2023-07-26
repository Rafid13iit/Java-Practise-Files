package Lab_4;

public class Person {

	private String firstName;
	private String familyName;
	
	public Person (String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", familyName=" + familyName + "]";
	}
	
	public boolean isEqualTo (Person person) { 
		return this.firstName.equalsIgnoreCase (person.firstName) && this.familyName.equalsIgnoreCase (person.familyName);
	}
}
