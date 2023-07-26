package ClassPackage;

public class class_method {
		
	String name, gender;
	int age;
	
	void setInformation(String n, String g, int a) {
	
		name = n;
		gender = g;
		age = a;
	}

	void displayInformation() {
		
		System.out.println("Teacher name is " +name);
		System.out.println("Gender is : " +gender);
		System.out.println("Age is : " +age);
	}
	
}