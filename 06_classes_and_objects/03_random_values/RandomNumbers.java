import java.util.Random;

public class RandomNumbers {
   // Instance variables
   private int var1;
   private int var2;
   private int var3;
   
   // Getter methods
   public int getVar1() {
      return var1;
   }

   public int getVar2() {
      return var2;
   }

   public int getVar3() {
      return var3;
   }

   // Sets var1, var2, and var3 to random numbers in the given range
   public void setRandomValues(int low, int high) {
      Random rand = new Random();
      var1 = rand.nextInt(high - low + 1) + low;
      var2 = rand.nextInt(high - low + 1) + low;
      var3 = rand.nextInt(high - low + 1) + low;
   }

   // Prints the random values in the required format
   public void getRandomValues() {
      System.out.println("Random values: " + var1 + " " + var2 + " " + var3);
   }
}
