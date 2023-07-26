package LAB5;

public class Main {
	public static void main (String[] args) {
		
		Shape shape;
		
		shape = new Triangle(10, 20);
		shape.Area();
		
		shape = new Rectangle(10, 20);
		shape.Area();
		
		shape = new Circle(10);
		shape.Area();
	}
}
