// Random values
// RandomNumbers class that sets three instance variables to random numbers within a given range.

import java.util.Scanner;

public class LabProgram {
   
   // main method used to test your code
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		RandomNumbers rn = new RandomNumbers();
		rn.setRandomValues(low, high);
		rn.getRandomValues();
	}
	
}
