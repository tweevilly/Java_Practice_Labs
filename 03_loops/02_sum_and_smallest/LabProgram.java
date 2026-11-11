// Sum and smallest
// Reads non-negative integers until a negative one, then prints the smallest value and the sum.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int num;
      int sum = 0;
      int smallest = Integer.MAX_VALUE;  // start with largest possible number
      
      while (true) {
         num = scnr.nextInt();
         
         if (num < 0) {   // stop reading if negative
            break;
         }
         
         sum += num;  // add to total
         
         if (num < smallest) {  // update smallest number
            smallest = num;
         }
      }
      
      // Output results
      System.out.println("Smallest: " + smallest);
      System.out.println("Sum: " + sum);
   }
}
