// Output pattern
// Prints a fixed 5-character-wide letter pattern with output statements.

public class LabProgram {
   public static void main(String[] args) {
      
      String letter = "H";
      String space = " ";
      
      for(int i =0; i<2; ++i){
         System.out.print(letter);
         for(int j =0; j <3; ++j){
         System.out.print(space);
         }
         System.out.println(letter);
      }
      for (int i = 0; i <5; ++i) {
         System.out.print(letter);
      }
      System.out.println();
      for(int i =0; i<2; ++i){
         System.out.print(letter);
         for(int j =0; j <3; ++j){
         System.out.print(space);
         }
         System.out.println(letter);
      }
         
   }
}
