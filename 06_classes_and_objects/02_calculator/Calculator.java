public class Calculator {
   
   private double value;

   // Constructor: sets initial value to 0.0
   public Calculator() {
      value = 0.0;
   }
   
   public void add(double val){
      value = value +val;
   }
   
   public void subtract(double val){
      value = value - val;
   }
   public void multiply(double val){
      value = value * val;
   }
   public void divide(double val){
     value = value / val;
   }
   public void clear( ){
      value = 0.0;
   }
   // Returns the current value
   public double getValue( ){
      return value;
   }
}
