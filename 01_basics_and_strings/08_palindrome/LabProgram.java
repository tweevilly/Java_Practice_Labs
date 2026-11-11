// Palindrome
// Reports whether a word or phrase reads the same forward and backward, ignoring case and non-alphanumeric characters.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input= scnr.nextLine();
      
      String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();    //here ^ means match any single character inside the brackets instedof replace
      String reversed = new StringBuilder(normalized).reverse().toString();
      if (normalized.equals(reversed)){
         System.out.println("palindrome: " + input);
      }
      else {
         System.out.println("not a palindrome: " + input);
      }
   }
}
