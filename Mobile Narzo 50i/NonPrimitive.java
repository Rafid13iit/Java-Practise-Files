package Basic2;

public class NonPrimitive {
	public static void main (String[] args) {
	 
		Student S1 = new Student();
		S1.Display();
		
		Student S2 = new Teacher();
		S2.Display(); 
		//Sub class in Super class, no prob
		
		/*
		Teacher T = new Student();
		T.Display();
		
		not possible
		
		
		Teacher T = (Teacher)new Student();
		T.Display();
		
		will have run time error 
		                      */
		
	}
}