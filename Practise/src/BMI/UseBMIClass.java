package BMI;

public class UseBMIClass {

	public static void main (String args[]) {
		
		BMI bmi1 = new BMI("Rafid", 21, 62, 72);
		System.out.println("The BMI for " + bmi1.getName() + " is "
				 + bmi1.getBMI() + ", Status: " + bmi1.getStatus());
		
		BMI bmi2 = new BMI("Jahangir", 22, 65, 64);
		System.out.println("The BMI for " + bmi2.getName() + " is "
				 + bmi2.getBMI() + ", Status: " + bmi2.getStatus());
	}
	
}
