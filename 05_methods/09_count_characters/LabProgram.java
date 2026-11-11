// Count characters
// calcNumCharacters(): counts how many times a character appears in a string.

import java.util.Scanner;
public class LabProgram {   
   public static int calcNumCharacters(String userString, char userChar){
      
      int count = 0;
      for (int i = 0; i < userString.length(); ++i){
         if (userString.charAt(i) == userChar){
            count++;
         }
      }
      return count;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      char userChar = scnr.next().charAt(0);
      String userString = scnr.nextLine();
       int count = calcNumCharacters(userString, userChar);
      
      if (count == 1){
         System.out.println(count + " " + userChar);
      }
      else {
         System.out.println(count + " " + userChar + "'s");
      }
   }
}
