package Main;

import java.util.Scanner;

public class User_Input {
	
	public static void main(String[] args) {
		
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your full name:");
		str = input.nextLine();
		
		System.out.println("You entered : " +str);
		
	}
}