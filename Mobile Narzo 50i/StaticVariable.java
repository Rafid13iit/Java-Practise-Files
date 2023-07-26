package Main;

public class StaticVariable {
	
	int count = 0;
	
	static int count2 = 0;
	
	
	StaticVariable(){
		count++;
		count2++;
	}
	
	void display (){
		System.out.println("\nWithout static variable student is : " +count);
		System.out.println("With Static variable student is : " +count2);
	}
}