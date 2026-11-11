// Simon Says
// Simon Says memory game: works with a 10-character sequence of R, G, B, and Y.

import java.util.Scanner;

public class SimonSays {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String simonPattern = scnr.next();
      String userPattern = scnr.next();
      int userScore =0;
      int i;

      for (i =0; i < simonPattern.length(); ++i){                         // iterate through simonPattern
         if (simonPattern.charAt(i) == userPattern.charAt(i)){            //compare character at position i
            userScore += 1;
         }
         else{
            break;
         }
      }
      System.out.println("userScore: " + userScore);
      return;
   }
}
