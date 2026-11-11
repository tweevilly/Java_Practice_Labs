// Leap year
// Determines whether a year is a leap year using the Gregorian calendar rules.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear = scnr.nextInt();                  // initialized variable at declaration
      boolean isLeapYear = false;
          
      // Determine if leap year
      if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0)) {         //moved else-if into if statement by using or 
         isLeapYear = true;
      }
      
      // Output result
      if (isLeapYear) {
         System.out.println(inputYear + " - leap year");
      } 
      else {
         System.out.println(inputYear + " - not a leap year");
      }
   }
}
