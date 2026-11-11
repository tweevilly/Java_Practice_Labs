// Returns and voids (zyBooks 6.1.4)
// calculateVal(): returns the first parameter minus twice the second.

import java.util.Scanner;

public class ValueCalculator {

   public static int calculateVal(int num1, int num2) {   
   return num1 - (2*num2);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input1;
      int input2;
      int result;
      
      input1 = scnr.nextInt();
      input2 = scnr.nextInt();

      result = calculateVal(input1, input2);

      System.out.println(result);
   }
}
