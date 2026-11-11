// Arithmetic and iteration
// Reads two integers and prints three successive products, each multiplying the previous result by the multiplier.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      
      int starting_num = scnr.nextInt();
      int multiplier = scnr.nextInt();
      int result = starting_num;

      // Repeat multiplication 3 times
      for (int i = 0; i < 3; i++) {
         result *= multiplier;  /
         if (i < 2) {
            System.out.print(result + " "); 
         } else {
            System.out.println(result); 
         }
      }
   }
}
