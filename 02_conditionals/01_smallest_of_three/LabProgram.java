// Smallest of three
// Reads three integers and prints the smallest.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input1 = scnr.nextInt();
      int input2 = scnr.nextInt();
      int input3 = scnr.nextInt();

      int smallest = Math.min(input1, Math.min(input2, input3));
      System.out.println(smallest);
   
   }
}

// reduced code to 13 lines
