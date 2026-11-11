public class Artwork {
   // Private fields
   private String title;
   private int yearCreated;
   private Artist artist; // field of type Artist

   // Default constructor
   public Artwork() {
      title = "unknown";
      yearCreated = -1;
      artist = new Artist(); // initialize with default Artist
   }

   // Second constructor
   public Artwork(String title, int yearCreated, Artist artist) {
      this.title = title;
      this.yearCreated = yearCreated;
      this.artist = artist;
   }

   // Get methods
   public String getTitle() {
      return title;
   }

   public int getYearCreated() {
      return yearCreated;
   }

   public Artist getArtist() {
      return artist;
   }

   // printInfo() method
   public void printInfo() {
      artist.printInfo(); // call Artist's printInfo() first
      System.out.println("Title: " + title + ", " + yearCreated);
   }
}
