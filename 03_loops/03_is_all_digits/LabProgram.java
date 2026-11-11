// Is all digits
// Prints Yes if every character of the input string is a digit 0-9, otherwise No.

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;

      userString = scnr.next();
      boolean isAllDigits = true;      //boolean is prim data type
      
      for (int i =0; i < userString.length(); ++i){
         char checker = userString.charAt(i);
         if (!Character.isDigit(checker)){            //isDigit is buitl in function
            isAllDigits = false;
            break;
         }
      }
      if (isAllDigits){
            System.out.println("Yes");
         }
      else {
            System.out.println("No");
      }
   }
}
