**Wrapper class conversions**

  Autoboxing is the automatic conversion of primitive types to the corresponding wrapper classes.
  
    Assign primitive type to wrapper class variable
          Double floorArea = 20.25; // Autoboxing of 20.25 to a Double
          Integer calcResult;

          calcResult = 5 / 2; // Autoboxing of expression result to Integer
        
          int num1 = 23;
          Integer num2 = num1; // Autoboxing of num1 to Integer
        
     Pass primitive type to a method with wrapper class parameter
           public void setRate(Double rate) {
           // ...
          }
            setRate(50.2); // Autoboxing of 50.2 to Double

            double newRate = 97.2;
            setRate(newRate); // Autoboxing of newRate to Double
  Unboxing is the automatic conversion of wrapper class objects to the corresponding primitive   types.
  
    Assign wrapper class variable to primitive type
          Double num1 = 3.14;
          Character letter1 = 'A';

          double num2 = num1; // Unboxing of Double to double
          char letter2 = letter1; // Unboxing of Character to char
          
    Pass wrapper class variable to a method with primitive type parameter
            public void setInitial(char letter) {
             // ...
            }
            Character userInitial = 'Z';
            setInitial(userInitial); // Unboxing of userInitial to a char

    Combine wrapper class and primitive types in expression
          Double currTemp = 95.2;
          double tempDiff = 100.0 - currTemp; // Unboxing of currTemp to double

          Integer numItems = 11;

  

          if (numItems % 2 == 0) { // Unboxing of numItems to int
           // ...
          }
          
  Converting to primitive types
  
      intValue()
          Returns the value of the wrapper class object as a primitive int value, type casting if necessary.
      
      doubleValue()
          Returns the value of the wrapper class object as a primitive double value, type casting if necessary.
      
      longValue()
          Returns the value of the wrapper class object as a primitive long value, type casting if necessary.

  Converting To and From Strings

      toString()	
          Returns a String containing the decimal representation of the value contained by the wrapper class object.
    
      Integer.toString(someInteger)	
          Returns a String containing the decimal representation of the value of someInteger. someInteger may be an 
          Integer object, a int variable, or an integer literal. This static method is also available for the 
          other wrapper classes (e.g.,  Double.toString(someDouble))
    
      Integer.parseInt(someString)	
          Parses someString and returns an int representing the value encoded by someString. This static method is 
          also available for the other wrapper classes (e.g., Double.parseDouble(someString)), 
          returning the corresponding primitive type.
    
      Integer.valueOf(someString)	
          Parses someString and returns a new Integer object with the value encoded by someString. 
          This static method is also available for the other wrapper classes (e.g., Double.valueOf(someString)), 
          returning a new object of the corresponding type.
    
      Integer.toBinaryString(someInteger)	
          Returns a String containing the binary representation of someInteger. someInteger may be an Integer object, 
          a int variable, or an integer literal. This static method is also available for the Long classes 
          (e.g.,  Long.toBinaryString(someLong)).
