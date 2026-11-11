// Swap adjacent pairs (zyBooks 6.26)
// swapValues(): swaps array elements at indices 0 and 1, and at indices 2 and 3.

import java.util.Scanner;
public class LabProgram {
    public static void swapValues(int[] arrVals) {
      
      for (int i = 0; i < arrVals.length - 1; i += 2) {
      int temp = arrVals[i];
      arrVals[i] = arrVals[i + 1];
      arrVals[i + 1] = temp;
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);            
      int[] userVals = new int[4];  // User values
      int i;                                 // Loop index

// Prompt user to populate array
      for (i = 0; i < userVals.length; ++i) {
         userVals[i] = scnr.nextInt();
      }

// Call method to reverse array values
    swapValues(userVals);
    
     for (i = 0; i < userVals.length; ++i) {
         if (i > 0) {
            System.out.print(" ");  // Print space before elements except the first
      }
      System.out.print(userVals[i]);
   }
   System.out.println();
   }
}
