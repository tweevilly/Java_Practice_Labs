// Read next input
// Loops until a negative number is read, printing "win" or "lose" for each value (win when divisible by 3).

import java.util.Scanner;

public class ResultCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int finalNum;
   
      finalNum = 0;
      userNum = scnr.nextInt();

      while (userNum >= 0) {
         if (userNum % 3 == 0) {
            System.out.println("win");
            finalNum ++ ;
         }
         else {
            System.out.println("lose");
         }
         userNum = scnr.nextInt();      //read next input from user
      System.out.println("Final number is " + finalNum);
   }
}
