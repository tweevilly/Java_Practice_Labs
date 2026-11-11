// Simple car
// SimpleCar class that drives forward and in reverse; LabProgram reads the miles and reports the result.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int forward = scnr.nextInt();
      int backward = scnr.nextInt();
      
      SimpleCar myCar = new SimpleCar();    // to use SimpleCar class, we create an object/instance myCar
            
      myCar.drive(forward);
      myCar.reverse(backward);
      myCar.honkHorn();
      myCar.report(); 
      
   }
}
