// Alphabetical order
// Reads three lowercase characters and prints them in alphabetical order.

import java.util.Scanner;
import java.util.Arrays;    //must import arrays to use arrays

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      char input1 = scnr.next().charAt(0);      //there is no scnr.nextChar();
      char input2 = scnr.next().charAt(0);
      char input3 = scnr.next().charAt(0);
      
       char[] letters = {input1, input2, input3};
       Arrays.sort(letters);                     //built in method
       System.out.println(letters[0] + " " + letters[1] + " " + letters[2]);
      
   }
}
