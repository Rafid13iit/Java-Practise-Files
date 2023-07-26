package basic;

class Outer{ //outer class
	int a = 10;
	
	void show (){
		System.out.println("Outer class 'a' is " +a);
	}
	
	class Inner{ // inner class in the outer class
		int a = 20;
		
		void display (){
			System.out.println("Inner class 'a' is " +a);
		}
	}
}

public class InnerDemo {

	public static void main (String args[]) {
		
		Outer obj1 = new Outer(); //object of the outer class
		obj1.show(); 
		
		Outer.Inner obj2 = obj1.new Inner(); //object of the inner class using outer class object
		obj2.display();
	}
	
}
