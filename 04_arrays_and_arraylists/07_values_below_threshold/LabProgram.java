// Values below a threshold (zyBooks 5.15)
// Prints every integer in a list that is less than or equal to a threshold value.

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userVals = new int[20];  
      int numElements = scnr.nextInt();
      int threshold;
      int i;
            
      for (i =0; i < numElements; ++i) {
         userVals[i] = scnr.nextInt();
      }
      threshold = scnr.nextInt();
      for (i =0; i < numElements; ++i) {
         if (userVals[i] <= threshold){
         System.out.print(userVals[i] + ",");
         }
      }
      System.out.println();
   }
}
