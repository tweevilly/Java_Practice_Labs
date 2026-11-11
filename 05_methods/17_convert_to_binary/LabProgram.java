// Convert to binary
// intToReverseBinary() and stringReverse() together print an integer in binary.

import java.util.Scanner;

public class LabProgram {
   
   public static String intToReverseBinary(int integerValue){
      int x = integerValue;
      String binary = "";
      while (x > 0){
         int output = x % 2;
         binary = binary + output;
         x = x / 2;
      }
      return binary;
   }
   
   public static String stringReverse(String inputString){
      String newString = "";
      for (int i=0; i < inputString.length(); ++i){
         newString = inputString.charAt(i) + newString;
      }
      return newString;
   }   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int num = scnr.nextInt();
      
      String binary = intToReverseBinary(num);
      String reversedBinary = stringReverse(binary);
      System.out.println(reversedBinary);         
   }
}
