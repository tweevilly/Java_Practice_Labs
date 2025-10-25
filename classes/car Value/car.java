/**Given main(), complete the Car class (in file Car.java) with methods to set and get the purchase 
* price of a car (setPurchasePrice(), getPurchasePrice()), and to output the car's information 
* (printInfo()).  */
  
  public class Car {
   private int modelYear; 
   private int purchasePrice;
    private int currentValue;// TODO: Declare purchasePrice field (int)
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   
   // TODO: Define setPurchasePrice() method
   public int setPurchasePrice(int userPrice) {
      purchasePrice = userPrice;
      return purchasePrice;
   }
   // TODO: Define getPurchasePrice() method
   public int getPurchasePrice() {
      return purchasePrice;
   }
   
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   // TODO: Define printInfo() method to output modelYear, purchasePrice, and currentValue
   public void printInfo() { 
      System.out.println("Car's information:");
      System.out.println("  Model year: " + modelYear);
      System.out.println("  Purchase price: $" + purchasePrice);
      System.out.println("  Current value: $" + currentValue);
      }
}
