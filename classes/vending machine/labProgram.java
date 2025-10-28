/* Given two integers as user inputs that represent the
number of drinks to buy and the number of bottles to
restock, create a VendingMachine object that performs the
following operations:
  Purchases input number of drinks
  Restocks input number of bottles
  Reports inventory
The VendingMachine is found in VendingMachine.java. A
VendingMachine's initial inventory is 20 drinks  */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int drinksToBuy = scnr.nextInt();
      int bottlesToRestock = scnr.nextInt();
      
      VendingMachine newVendingMachine = new VendingMachine();    
      
      newVendingMachine.purchase(drinksToBuy);
      newVendingMachine.restock(bottlesToRestock);
      newVendingMachine.report();
      
   }
}
