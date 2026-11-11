// Nth from end
// Prints the Nth number from the end of a list; a negative input ends the list and supplies N.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] array = new int[20]; // array will hold fewer than 20 integers
      int count = 0;
      int n = 0;

      while (true) {
         int num = scnr.nextInt();

         if (num < 0) {
            n = -num; // convert last negative to positive
            break;
         }

         array[count] = num;
         count++;
      }

      // If array is smaller than N, output the negative number
      if (count < n) {
         System.out.println(-n);
      } 
      else {
         // Nth number from the end means index = count - n
         System.out.println(array[count - n]);
      }
   }
}
