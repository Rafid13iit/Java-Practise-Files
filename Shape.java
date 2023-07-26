package LAB5;

public abstract class Shape {
	double length1, length2;
	
	Shape (double length1, double length2){
		this.length1 = length1;
		this.length2 = length2;
	}
	
	abstract void Area();
}
