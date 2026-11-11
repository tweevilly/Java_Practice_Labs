// Hailstone sequence
// Prints the hailstone sequence for an integer, ten values per line separated by tabs.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input = scnr.nextInt();
      int count =0;
      
      while (input != 1){
         System.out.print(input + "\t");
         count++;
         
         if (count % 10 == 0){
            System.out.println();
         }
         
         if(input % 2 == 0){
            input = input/2;
         }
         else {
            input = (input *3) + 1;
         }  
      }
      System.out.print(input);
      System.out.println();
   }  
}
