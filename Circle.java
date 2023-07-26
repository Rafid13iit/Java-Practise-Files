package LAB5;

public class Circle extends Shape{
	//length1, length2
	
		Circle (double length1){
			super(length1, length1);
		}
		
		@Override
		void Area() {
			double result = 3.1416 * length1 * length1;
			System.out.println("Circle area is : " +result+ " square unit");
		}
}
