// Carpet sales (zyBooks 13.18)
// Computes carpet, labor, tax, and total cost for each room order, plus total sales.

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double totalSales = 0.0;

      for (int i = 1; i <= 3; ++i) {  
         totalSales += calcRoomCost(scnr, i); 
      }
      System.out.printf("Total Sales: $%.2f\n", totalSales);
   }
   
   public static double calcRoomCost(Scanner scnr, int orderNum) {      //create method for reusibility

       double carpetPrice = scnr.nextDouble();
       int roomWidth = scnr.nextInt();
       int roomLength = scnr.nextInt();
       
       int area = roomWidth * roomLength;
       double adjustCarpet  = ((area * 0.2) + area) * carpetPrice;
       double labor = area * 0.75;
       double tax = (labor + adjustCarpet) * 0.07;
       double cost = adjustCarpet + tax + labor;
       
       System.out.println("Order #" + orderNum);
       System.out.println("Room: " + area +  " sq ft");
       System.out.printf("Carpet: $%.2f\n", adjustCarpet);
       System.out.printf("Labor: $%.2f\n", labor);
       System.out.printf("Tax: $%.2f\n", tax);
       System.out.printf("Cost: $%.2f\n", cost);
       System.out.println();
       return cost;
   }
}
