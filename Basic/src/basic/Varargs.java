package basic;

class Calc{
	
	int add (int ... n) { // variable length argument
		
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		
		return sum;
	}
}

public class Varargs {

	public static void main (String args[]) {
		
		Calc calc = new Calc();
		
		//you can pass number of arguments as you wish, it will give the result
		System.out.println(calc.add(2, 3, 4, 1));
		System.out.println(calc.add(2, 3));
		System.out.println(calc.add(2, 3, 4, 1, 100, 200, 140, 50));
	}
}
