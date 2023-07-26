package com.Exception;

public class ExceotionHandling {

	public static void main (String args[]) {
		
		int i = 9;
		int j = 0;
		
		try {
			int k = i / j;
			System.out.println(k);
		}
		catch (ArithmeticException e){ // can be used -> (Exception e)
			System.out.println("Can not divide by Zero!");
		}
		finally {
			System.out.println("Allah Hafiz!");
		}
		
	}
}
