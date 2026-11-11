// Name format (zyBooks 3.26)
// Reformats "first [middle] last" as "last, F.M.".

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String wholeName = scnr.nextLine();
      String [] parts = wholeName.split (" ");    //split at space
      
      String firstName = parts[0];
      String middleName;
      String lastName;
      
      if (parts.length == 3 ) {
         middleName = parts[1];
         lastName = parts[2];
         System.out.println(lastName + ", " + firstName.charAt(0) + "." +  middleName.charAt(0) + ".");
      }
      else if (parts.length == 2) {
         lastName = parts[1];
         System.out.println(lastName + ", " + firstName.charAt(0) + ".");
      }
      else {
         System.out.println("Invalid format");
      }
   }
}

// convert all first letters of each word to uppercase?
