// Matrix multiplication
// Multiplies a 1xN matrix by an NxN matrix and prints the 1xN result.

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int n = scnr.nextInt();
      
      if (n < 2){
         return;
      }
      
      int[] matrixA = new int[n];        // Matrix A
      int[][] matrixB = new int[n][n];   // Matrix B 
      int[] matrixC = new int[n];        // Matrix C
      
      for (int i = 0; i < n; ++i){
         matrixA[i] = scnr.nextInt();
      }
      
      for (int i = 0; i < n; ++i){
         for (int j = 0; j <n; ++j){
            matrixB[i][j] = scnr.nextInt();
         }
      }
      
      for (int j = 0; j < n; ++j) {
         int sum = 0;
         for (int i = 0; i < n; ++i) {
            sum += matrixA[i] * matrixB[i][j];
         }
         matrixC[j] = sum;
      }
      for (int j = 0; j < n; ++j) {
         System.out.print(matrixC[j] + " ");
      }
      System.out.println();
   }
}
