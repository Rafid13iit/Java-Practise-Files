package LABfinalExam;

public class EncryptionUtil {

	// encrypt method
	public String encrypt(String password) {
		
		char temp;
		for (int i = 0; i < password.length(); i++) {
			temp = password.charAt(i+1);
			password[i] = password.charAt(i);
				
		}
		
		return password;
	}
	
	
	// decrypt method
	public String decrypt(String password) {
		char temp;
		for (int i = 0; i < password.length(); i++) {
			temp = password.charAt(i+1);
			password[i]  = password.charAt(i);
				
		}
		
		return password;
	}
}
