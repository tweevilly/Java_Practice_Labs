// Name initials
// Formats a full name as "lastInitial., firstName middleInitial." (the middle name is optional).

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String fullName = scnr.nextLine();

      String[] parts = fullName.trim().split("\\s+");

      if(parts.length == 2){
         System.out.println(parts[1].charAt(0)+ "., " + parts[0]);
      }
      if(parts.length == 3){
         System.out.println(parts[2].charAt(0)+ "., " + parts[0] + " " + parts[1].charAt(0) + ".");
      }
   }
}
