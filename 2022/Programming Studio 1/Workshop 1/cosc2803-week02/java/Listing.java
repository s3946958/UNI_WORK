public class Listing {
   // These are examples properties
   private String title;
   private double price;

   private String description;
   private String location;

   // Setters
   public void setTitle(String inTitle) {
      title = inTitle;
   }

   public void setPrice(double inPrice) {
      price = inPrice;
   }

   public void setDescription(String inDesctiption) {
      description = inDesctiption;
   }

   public void setLocation(String inLocation) {
      location = inLocation;
   }

   // Getters
   public String getTitle() {
      return title;
   }

   public double getPrice() {
      return price;
   }

   public String getDescription() {
      return description;
   }

   public String getLocation() {
      return location;
   }
   
   public void printInfo() {
      System.out.println("Item: " + title);
      System.out.println("\tPrice: " + price);
      System.out.println("\tDescrition: " + description);
      System.out.println("\tLocation: " + location);
   }
}