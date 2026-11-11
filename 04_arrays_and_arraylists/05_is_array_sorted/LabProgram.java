// Is array sorted
// Prints yes if a list is sorted in ascending order between two given positions, otherwise no.

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input
      int max = scnr.nextInt(); 
      int yes = 0;
      // number of items in list
      
      for (int i = 0 ; i < max; ++i){
         userValues[i] = scnr.nextInt();
      }
      int start = scnr.nextInt();
      int end = scnr.nextInt();
      int compValue = end - start;
      
      for (int i = start -1 ; i < end; ++i){         
         if(userValues[i] < userValues[i +1]){
            yes ++;
         }
      }
      
     if (yes == compValue){
        System.out.println("yes");
     }
     else {
        System.out.println("no");
     }
   }
}
