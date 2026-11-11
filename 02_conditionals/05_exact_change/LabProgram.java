// Exact change
// Converts an amount in pennies into the fewest coins (dollars, quarters, dimes, nickels, pennies), using singular and plural coin names.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalCents;
      int dollars, quarters, dimes, nickels, pennies;      // Declare multiple integer variables in a single statement.

      totalCents = scnr.nextInt();

      if (totalCents <= 0) {
         System.out.println("No change");
         return;
      }

  // Calculate coins
      dollars = totalCents / 100;
      totalCents %= 100;
      quarters = totalCents / 25;
      totalCents %= 25;
      dimes = totalCents / 10;
      totalCents %= 10;
      nickels = totalCents / 5;
      totalCents %= 5;
      pennies = totalCents;

  // Output results (only print nonzero amounts)
      if (dollars > 0) {
         System.out.println(dollars + " " + (dollars == 1 ? "Dollar" : "Dollars"));
      }
      if (quarters > 0) {
         System.out.println(quarters + " " + (quarters == 1 ? "Quarter" : "Quarters"));
      }
      if (dimes > 0) {
         System.out.println(dimes + " " + (dimes == 1 ? "Dime" : "Dimes"));
      }
      if (nickels > 0) {
         System.out.println(nickels + " " + (nickels == 1 ? "Nickel" : "Nickels"));
      }
      if (pennies > 0) {
         System.out.println(pennies + " " + (pennies == 1 ? "Penny" : "Pennies"));
      }
   }

}
