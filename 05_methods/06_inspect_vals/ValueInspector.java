// Inspect values (zyBooks 6.6.2)
// inspectVals(Scanner): returns true if no value before -1 is between 900 and 1000.

import java.util.Scanner;

public class ValueInspector {
   
   public static boolean inspectVals(Scanner scnr) {
      int number = scnr.nextInt();
      boolean allAllowed = true;
   
      while (number != -1) {
         if (number >= 900 && number <= 1000){
         allAllowed = false;
         }
         number = scnr.nextInt();
      }

      return allAllowed;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      boolean allAllowed;
      
      allAllowed = inspectVals(scnr);
      if (allAllowed) {
			System.out.println("All allowed values");
		}
		else {
			System.out.println("Unallowed value(s)");
		}
   }
}
