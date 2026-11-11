// Digit sum divisible by 3
// Reads three digits and reports whether their sum is divisible by 3; prints "Invalid input!" for a negative digit.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);         
      int input1 = scnr.nextInt();
      int input2 = scnr.nextInt();
      int input3 = scnr.nextInt();
      
      if (input1 <0 || input2 <0 || input3 <0){
         System.out.println("Invalid input!");
         System.exit(0); 
      }
      
      int sum = input1 + input2 + input3;
      
      if (sum % 3 == 0){
         System.out.print(input1);
         System.out.print(input2);
         System.out.print(input3);
         System.out.print(" is divisible by 3!");
      }
      else {
         System.out.print(input1);
         System.out.print(input2);
         System.out.print(input3);
         System.out.print(" is not divisible by 3!");
      }
      System.out.println();
   }
}
