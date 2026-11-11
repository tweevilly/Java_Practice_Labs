// Volume of a pyramid (zyBooks 6.1.3)
// pyramidVolume(): volume of a pyramid with a rectangular base.

import java.util.Scanner;

public class CalcPyramidVolume {
   public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {
      double baseArea = baseLength * baseWidth;
      double volume = baseArea * pyramidHeight * (1.0 / 3.0);
      return volume;
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double userLength;
      double userWidth;
      double userHeight;

      userLength = scnr.nextDouble();
      userWidth = scnr.nextDouble();
      userHeight = scnr.nextDouble();

      System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
   }
}
