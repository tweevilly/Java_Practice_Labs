// Login name (zyBooks 3.27)
// Builds a login name from the first six letters of the first name, the first letter of the last name, an underscore, and the last digit of a number.

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
	   Scanner scnr =new Scanner(System.in);
	   
	   String firstName = scnr.next();
	   String lastName = scnr.next();
	   int year = scnr.nextInt();
	  	   
	   int lastDigit = (year % 10);;
	   
	   if (firstName.length() > 6) {
	      System.out.println("Your login name: " + firstName.substring(0,6) + lastName.charAt(0) + "_" + lastDigit);
	   }
	   else if (firstName.length() <= 6) {
		System.out.println("Your login name: " + firstName + lastName.charAt(0) + "_" + lastDigit);
	   }
	   else{
	      System.out.println("invalid format");
	   }
	}
}
