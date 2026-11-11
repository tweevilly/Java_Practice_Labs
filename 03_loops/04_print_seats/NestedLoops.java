// Print seats
// Prints every seat label in a theater (1A, 1B, 2A, ...) with nested loops.

import java.util.Scanner;
public class NestedLoops {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      for (currentRow =1; currentRow <= numRows; ++currentRow) {
         for (currentColumn = 0; currentColumn < numColumns; ++currentColumn){
            System.out.print(currentRow);
            System.out.print((char)('A' + currentColumn));
            System.out.print(" ");
         }
      }
      
      System.out.println("");
   }
}
