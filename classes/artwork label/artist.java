/*  Given main(), define the Artist class (in file Artist.java) with constructors to
initialize an artist's information, get methods, and a printInfo() method. The
default constructor should initialize the artist's name to "unknown" and the years 
of birth and death to -1. printInfo() displays "Artist:", then a space, then the
artist's name, then another space, then the birth and death dates in one of three
formats:
(XXXX to YYYY) if both the birth and death years are nonnegative
(XXXX to present) if the birth year is nonnegative and the death year is negative
(unknown) otherwise */

public class Artist {
   // TODO: Declare private fields - artistName, birthYear, deathYear
   private String artistName;
   private int birthYear;
   private int deathYear;

   // TODO: Define default constructor
   public Artist() {
      artistName = "unknown";
      birthYear = -1;
      deathYear = -1;
   }    

   // TODO: Define second constructor to initialize 
   //       private fields (artistName, birthYear, deathYear)
   public Artist(String artistName, int birthYear, int deathYear) {
      this.artistName = artistName;
      this.birthYear = birthYear;
      this.deathYear = deathYear;
   }    
   // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
   public String getName() {
      return artistName;
   }
   public int getBirthYear() {
      return birthYear;
   }
   public int getDeathYear() {
      return deathYear;
   }

   // TODO: Define printInfo() method
   //       If deathYear is entered as -1, only print birthYear
   public void printInfo() {
      System.out.print("Artist: " + artistName + " ");
      if (birthYear > 0 && deathYear > 0){
         System.out.print("("+ birthYear + " to " + deathYear + ")");
      }
      else if(birthYear > 0 && deathYear < 0 ){
         System.out.print("(" + birthYear + " to present)");
      }
      else {
         System.out.print("(unknown)");
      }
      System.out.println();
   }
}
