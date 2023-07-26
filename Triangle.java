package LAB5;

public class Triangle extends Shape {
	//length1, length2
	
	Triangle (double length1, double length2){
		super(length1, length2);
	}
	
	@Override
	void Area() {
		double result = .5 * length1 * length2;
		System.out.println("Triangle area is : " +result+ " square unit");
	}
}
