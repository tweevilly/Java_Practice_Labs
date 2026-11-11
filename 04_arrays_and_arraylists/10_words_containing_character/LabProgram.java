// Words containing a character (zyBooks 5.18)
// Prints every word in a list that contains a given character.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements = scnr.nextInt();
      String [] userVals = new String [20];
      String letter= " ";
      int i, j;
      
      for (i =0; i < numElements; ++i) {
         userVals[i] = scnr.next();
      }       
       letter = scnr.next();       
      for (i =0; i < numElements; ++i) {
         if (userVals[i].contains(letter)){
             System.out.print(userVals[i] + ",");
          }
       } 
      System.out.println();
   }
}
