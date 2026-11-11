// Acronyms
// createAcronym(): builds an acronym from the words that start with an uppercase letter.

import java.util.Scanner;

public class LabProgram {
   public static String createAcronym(String userPhrase){
      String acronym = "";
      String[] words = userPhrase.split(" ");   // split phrase into words
      for (String word : words) {
         if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
            acronym += word.charAt(0) + "."; // append uppercase first letter + period
         }
      }

      return acronym;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      String userPhrase = scnr.nextLine();
      
      String acronym = createAcronym(userPhrase);
      System.out.println(acronym);
      
   }
}
