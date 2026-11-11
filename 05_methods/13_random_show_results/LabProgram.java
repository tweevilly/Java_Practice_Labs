// Random show results
// showResults(Random): returns "true" or "false" from a random 0 or 1.

import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   public static boolean showResults(Random rand) {
      int results = rand.nextInt(2);
      return (results == 1);
   }  
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); 
    
      int inputs = scnr.nextInt();  
      
      for (int i = 0; i < inputs; ++i) {
         System.out.println(showResults(rand));
      }      
   }
}
