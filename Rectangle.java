package LAB5;

public class Rectangle extends Shape {
	//length1, length2
	
		Rectangle (double length1, double length2){
			super(length1, length2);
		}
		
		@Override
		void Area() {
			double result = length1 * length2;
			System.out.println("Reactangle area is : " +result+ " square unit");
		}
}
