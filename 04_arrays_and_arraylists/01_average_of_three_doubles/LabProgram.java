// Average of three doubles
// Stores three doubles in an array and prints their average.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double [] userVals = new double[3];
      int i;
      double sum=0;
      
      System.out.print("Array items: ");
      for (i =0; i < 3; ++i) {
         userVals[i] = scnr.nextDouble();
         System.out.print(userVals[i]);
         if (i < 2){
            System.out.print(", ");
         }
         sum += userVals[i];
      }
      System.out.println();
      System.out.println("Average: " + sum/3);
      
   }
}
