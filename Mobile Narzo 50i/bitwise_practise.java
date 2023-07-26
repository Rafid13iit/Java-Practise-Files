package Main;

public class bitwise_practise {
	
	public static void main(String[] args) {
		
		int a = 40;
		int c = a >> 2;
		
		System.out.println("a = 40, a >> 2, after right shift : " +c);
		
		c = a << 3;
		System.out.println("a = 40, a << 3, after left shift : " +c);
		
		c = 0b1010;
		System.out.println("Binary to Decimal : " +c);
		
		c = 0xA;
		System.out.println("Hex to Decimal : " +c);
		
		c = 0111;
		System.out.println("Octal to Decimal : " +c);
		
		double d = 6.023e23;
		System.out.println("Avogedro : " +d);
		
		c = 10_100_200;
		System.out.println("Without underscore : " +c);
	}
}