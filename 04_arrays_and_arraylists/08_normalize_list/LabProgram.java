// Normalize a list (zyBooks 5.16)
// Divides every value in a list by the largest value.

import java.util.Scanner; 
public class LabProgram {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
      double[] userVals = new double [19];  
      int numElements = scnr.nextInt();
      double max= 0;
      int i;
      
      for (i =0; i < numElements; ++i) {
         userVals[i] = scnr.nextDouble();
         if (userVals[i]>max){
             max = userVals[i];
          }
      }      
       for (i =0; i < numElements; ++i) {
         System.out.printf("%.2f ", (userVals[i] / max));
      }                  
     System.out.println();
   }
}
