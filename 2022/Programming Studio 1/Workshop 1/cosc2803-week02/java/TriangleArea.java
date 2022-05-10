import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         Triangle triangle1 = new Triangle();
         Triangle triangle2 = new Triangle();
         Triangle larger;

         triangle1.setBase(scnr.nextDouble());
         triangle1.setHeight(scnr.nextDouble());
         
         triangle2.setBase(scnr.nextDouble());
         triangle2.setHeight(scnr.nextDouble());
         
         if (triangle1.getArea() > triangle2.getArea()) {
            larger = triangle1;
         } else {
            larger = triangle2;
         }
         
         System.out.println("Triangle with larger area:");
         larger.printInfo();
      }
   }
}
