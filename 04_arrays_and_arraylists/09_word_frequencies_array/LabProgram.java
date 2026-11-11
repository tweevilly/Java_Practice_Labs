// Word frequencies (arrays) (zyBooks 5.17)
// Reads a list of words and prints each word with how many times it appears.

import java.util.Scanner; 
public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements = scnr.nextInt();
      String [] userVals = new String [20];
      int i, j;
   
      for (i =0; i < numElements; ++i) {
         userVals[i] = scnr.next();
      }      
      for (i = 0; i < numElements; ++i) {
         int count = 0;
         for (j = 0; j < numElements; ++j) {
            if (userVals[i].equals(userVals[j])){
            ++count;
            }
         }
         System.out.println(userVals[i] + " - " + count);
      }
   }
}
