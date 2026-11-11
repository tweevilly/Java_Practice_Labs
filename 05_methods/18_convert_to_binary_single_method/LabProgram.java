// Convert to binary (single method)
// Variant that builds the binary string in the correct order, so stringReverse() is not needed.

import java.util.Scanner;

/* note we could entirely remove the stringReverse method if we tweaked the 
intToBinary method in just one line */
public class LabProgram {
   
   public static String intToReverseBinary(int integerValue){
      int x = integerValue;
      String binary = "";
      while (x > 0){
         int output = x % 2;
         binary = output + binary;    //this switch would store binary form
         x = x / 2;
      }
      return binary;
   }   
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int num = scnr.nextInt();
      
      String binary = intToReverseBinary(num);
      System.out.println(binary);         
   }
}
