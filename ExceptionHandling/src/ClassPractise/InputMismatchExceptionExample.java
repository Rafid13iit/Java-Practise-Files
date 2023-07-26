package ClassPractise;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionExample {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter an integer: ");
      try {
         int value = scan.nextInt();
         System.out.println("You entered: " + value);
      } catch (InputMismatchException e) {
         System.out.println("Invalid input. Please enter an integer.");
      } finally {
         scan.close();
      }
   }
}
