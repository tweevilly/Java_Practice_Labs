public class SimpleCar {    // A CAR IS AN OBJECT
                             
   // Number of miles driven
   private int miles;
   
   public SimpleCar(){            //SimpleCar methods are instnace methods to use we need an object
      miles = 0;
   }

   public void drive(int dist){      //methods can only be called if they are declared static
      miles = miles + dist;
   }
 
   public void reverse(int dist){
      miles = miles - dist;
   }
   
   public int getOdometer(){
      return miles;
   }

   public void honkHorn(){
      System.out.println("beep beep");
   }

   public void report(){
      System.out.println("Car has driven: " + miles + " miles");
   }

}
