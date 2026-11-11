// Print methods (zyBooks 6.2.3)
// Print methods that output a country's capital.

import java.util.Scanner;
public class Capital {
	public static void printCapital(String var1, String var2) {
		System.out.println(var1 + " is " + var2 + "'s capital.");
	}
	public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String input1 = scnr.next();
      String input2 = scnr.next();
      String input3 = scnr.next();
      String input4 = scnr.next();

      printCapital(input1, input3);
      printCapital(input2, input4);
	}
}
