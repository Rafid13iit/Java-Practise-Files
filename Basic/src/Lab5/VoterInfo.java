package Lab5;

public abstract class VoterInfo {

	String name;
	int age;
	String nationality;
	String religion;
	long nidNumber;
	
	public VoterInfo(String name, int age, String nationality, String religion, long nidNumber) {
		
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.religion = religion;
		this.nidNumber = nidNumber;
	}
	
	abstract void DisplayInfo();
	
}