package Main;

public class StaticVariableTest {
	
	public static void main(String[] args) {
		
		StaticVariable S1 = new StaticVariable();
		S1.display();
		
		StaticVariable S2 = new StaticVariable();
		S2.display();
		
		StaticVariable S3 = new StaticVariable();
		S3.display(); 
		// this will every time show 1 because every time for every object it takes memory called the method newly
	}
}