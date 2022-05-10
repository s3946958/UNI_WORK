public class GoodsWebsite {

   public static void main(String[] args) {
      
      Listing item1 = new Listing();
      Listing item2 = new Listing();
      Listing item3 = new Listing();

      item1.setTitle("Door");
      item1.setPrice(100);
      item1.setDescription("big ol door");
      item1.setLocation("geelong");

      item2.setTitle("Camera");
      item2.setPrice(1000);
      item2.setDescription("canon eos 1500d");
      item2.setLocation("tarneit");

      item3.setTitle("3d printer");
      item3.setPrice(400);
      item3.setDescription("ender 3 V2");
      item3.setLocation("melbourne CBD");
      
      item1.printInfo();
      item2.printInfo();
      item3.printInfo();
   }
}