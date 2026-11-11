// Vending machine
// VendingMachine class that simulates purchasing drinks, restocking bottles, and checking inventory.

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
