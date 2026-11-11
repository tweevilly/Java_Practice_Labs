// Wedding tables
// Calculates how many full tables of 10 are needed for the expected number of guests.

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int tableSize =10;
      int guests = scnr.nextInt();
      int tablesFilled = guests / tableSize;
      
      System.out.println("Tables filled: " +tablesFilled);
      
   }
}
