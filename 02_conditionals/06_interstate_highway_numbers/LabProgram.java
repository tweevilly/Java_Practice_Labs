// Interstate highway numbers
// Classifies a highway number as primary or auxiliary, names the primary highway an auxiliary route serves, and reports whether a primary highway runs north/south or east/west.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int highwayNumber = scnr.nextInt();
      int primaryNumber;
      String highwayType = " ";              // initialize variables upon declaration

      if ((highwayNumber >= 1) && (highwayNumber <= 99)) {
         highwayType = "Primary";
         System.out.println("I-" + highwayNumber + " is primary, going " 
                            + ((highwayNumber % 2 == 0) ? "east/west." : "north/south."));         // shorthand if-else statement; 0 = evens, 1 = odds
      }
      else if (highwayNumber % 100 == 0) {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
      else if ((highwayNumber >= 100) && (highwayNumber <= 999)) {
         highwayType = "Auxiliary";
         primaryNumber = highwayNumber % 100;
         System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" 
                            + primaryNumber + ", going " 
                            + ((primaryNumber % 2 == 0) ? "east/west." : "north/south."));
      }
      else {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
   }
}
