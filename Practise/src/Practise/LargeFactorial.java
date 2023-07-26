package Practise;

import java.math.*;
import java.util.Scanner;

public class LargeFactorial {
	
	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which numbers factorial do you want to see?");
		int num = input.nextInt();
		
		System.out.println(num + "! is :\n" + factorial(num));	
	}
	
	public static BigInteger factorial (long n) {
		BigInteger result = BigInteger.ONE;
		
		for (int i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(i + ""));
		}
		
		return result;
	}

}
