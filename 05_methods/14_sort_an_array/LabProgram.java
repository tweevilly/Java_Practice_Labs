// Sort an array (zyBooks 6.28)
// sortArray(): sorts an integer array.

import java.util.Scanner;

public class LabProgram {

   public static void sortArray(int[] arr, int numElements) {
      for (int i = 0; i < numElements - 1; ++i) {
         for (int j = i + 1; j < numElements; ++j) {
            if (arr[i] < arr[j]) { // Swap to sort descending
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
   }

   public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int max = scnr.nextInt();
	int[] sortArray = new int[max];
	int i;
	
	for (i=0; i < max; ++i){
		sortArray[i] = scnr.nextInt();
	}
	sortArray(sortArray, max);

   for (i = 0; i < max; ++i) {
      System.out.print(sortArray[i] + ",");
   }
   System.out.println();		
   }
}
