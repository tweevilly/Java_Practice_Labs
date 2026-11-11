// Step counter
// feetToSteps(): converts feet walked to steps at 2.5 feet per step.

import java.util.Scanner;

public class LabProgram {
   
   public static int feetToSteps(double feet){    //importanto return int
      double steps = feet / 2.5;                  // takes in double 
      return (int) steps;
   }
      
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);      
      double feet = scnr.nextDouble();
      int steps = feetToSteps(feet);
      System.out.println(steps);  
   }
}
