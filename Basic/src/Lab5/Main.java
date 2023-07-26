package Lab5;

public class Main {
	
	public static void main (String[] args) {
		
		VoterInfo voterInfo;
		
		voterInfo = new Voter1("Rafid", 20, "Bangladeshi", "Islam", 676743216);
		voterInfo.DisplayInfo();
		
		voterInfo = new Voter2("Rony", 22, "Bangladeshi", "Hindu", 456456216);
		voterInfo.DisplayInfo();
		
	}
}
