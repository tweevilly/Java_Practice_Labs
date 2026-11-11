// Formatted name, age, and salary
// Reads a full name, age, and salary on separate lines and prints a formatted message.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);        
      String full_name = scnr.nextLine();
      int age = scnr.nextInt();
      String salary = scnr.next();
      
      System.out.println(full_name + " is " + age + " and makes $" + salary + ".");
      
   }
}
