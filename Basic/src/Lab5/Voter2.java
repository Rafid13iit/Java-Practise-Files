package Lab5;

public class Voter2 extends VoterInfo {

	public Voter2(String name, int age, String nationality, String religion, long nidNumber) {
		super(name, age, nationality, religion, nidNumber);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void DisplayInfo() {
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Nationality : " +nationality);
		System.out.println("Religion : " +religion);
		System.out.println("NID : " +nidNumber);
		System.out.println();
	}
}
