// Remove non-alphabetic characters
// removeNonAlpha(): strips every non-alphabetic character from a string.

import java.util.Scanner; 

public class LabProgram {
   public static String removeNonAlpha(String userString){
     
           /* replaceAll() replaces all substrings matching a regex pattern.
            [^a-zA-Z] means:
            [] → character class
            ^ → negation (means “not”)
            a-zA-Z → lowercase and uppercase English letters */
     
      String adjusted = userString.replaceAll("[^a-zA-Z]", "");
      return adjusted;
   }       
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      String userString = scnr.nextLine();
      String adjusted = removeNonAlpha(userString);
      System.out.println(adjusted);
      
      
   }
}
