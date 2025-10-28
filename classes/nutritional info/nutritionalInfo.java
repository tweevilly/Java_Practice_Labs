/* Given main(), complete the FoodItem class (in file FoodItem.java) with
*constructors to initialize each food item. The default constructor should 
*initialize the name to "Water" and all other fields to 0.0. 
*The second constructor should have four parameters (food name, grams of fat, 
*grams of carbohydrates, and grams of protein) and should assign each 
*private field with the appropriate parameter value.  */

import java.util.Scanner;

public class NutritionalInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FoodItem foodItem;
      
      String itemName = scnr.next();
      if(itemName.equals("Water") || itemName.equals("water")) {
         foodItem = new FoodItem();
         
         foodItem.printInfo();
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0, 
                          foodItem.getCalories(1.0));
      }
      
      else {
         double amountFat = scnr.nextDouble();
         double amountCarbs = scnr.nextDouble();
         double amountProtein = scnr.nextDouble();
      
         foodItem = new FoodItem(itemName, amountFat, amountCarbs, amountProtein);
      
         double numServings = scnr.nextDouble();
                                                      
         foodItem.printInfo();
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0,
                             foodItem.getCalories(1.0));
                             
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings,
                             foodItem.getCalories(numServings));
      }
   }
}
