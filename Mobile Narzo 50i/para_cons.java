package ClassPackage;

public class para_cons {
	
	String name, gender;
	int age;
	
	//parameterized constructor
	para_cons(String n, String g, int a) {
	
		name = n;
		gender = g;
		age = a;
	}
	
	para_cons(){
	
		System.out.println("Empty!");
	}
	
	void displayInformation() {
		
		System.out.println("Teacher name is " +name);
		System.out.println("Gender is : " +gender);
		System.out.println("Age is : " +age);
	}
}