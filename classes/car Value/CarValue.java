/** Given main(), complete the Car class (in file Car.java) with methods to set and get the 
* purchase price of a car (setPurchasePrice(), getPurchasePrice()), and to output the car's 
* information (printInfo()).  */

import java.util.Scanner;
import java.lang.Math;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Car myCar = new Car();
      
      int userYear = scnr.nextInt();
      int userPrice = scnr.nextInt();
      int userCurrentYear = scnr.nextInt();
      
      myCar.setModelYear(userYear);
      myCar.setPurchasePrice(userPrice);
      myCar.calcCurrentValue(userCurrentYear);
      
      myCar.printInfo();
   }
}
