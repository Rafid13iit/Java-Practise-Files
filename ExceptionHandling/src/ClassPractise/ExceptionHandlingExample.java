package ClassPractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingExample {
   public static void main(String[] args) {
      try {
         readFile("file.txt");
      } catch (FileNotFoundException e) {
         System.out.println("File not found: " + e.getMessage());
      } finally {
         System.out.println("Finally block is executed.");
      }
   }

   private static void readFile(String fileName) throws FileNotFoundException {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);

      try {
         String line = scanner.nextLine();
         System.out.println("Line from file: " + line);
      } catch (Exception e) {
         System.out.println("An exception occurred: " + e.getMessage());
         throw e;
      } finally {
         scanner.close();
         System.out.println("Scanner closed.");
      }
   }
}
