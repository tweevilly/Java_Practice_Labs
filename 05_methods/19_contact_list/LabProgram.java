// Contact list
// Parses comma-separated name/phone pairs into two arrays and looks up a number by name; prints None if not found.

// Plan (my notes):
//   split entries by ","
//   store values in two arrays
//   if array value equals name contact name output phone number

import java.util.Scanner; 

public class LabProgram {
   public static String getPhoneNumber(String[] nameArr, String[] phoneNumberArr, String contactName, int arraySize){
      for (int i = 0; i < arraySize; ++i) {
         if (nameArr[i].equals(contactName)) {
            return phoneNumberArr[i];
         }
      }
      return "None";
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      
      int arraySize = scnr.nextInt();
      
      String[] nameArr = new String[arraySize];
      String[] phoneNumberArr = new String[arraySize];
      for (int i = 0; i < arraySize; ++i) {
         String entry = scnr.next();  // example: "Joe,123-5432"
         String[] parts = entry.split(",");
         nameArr[i] = parts[0];
         phoneNumberArr[i] = parts[1];
      }
      
      String contactName = scnr.next();
      
      System.out.println(getPhoneNumber(nameArr, phoneNumberArr, contactName, arraySize));
      
   }
}
