import java.util.ArrayList;
import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {      
      try (Scanner scnr = new Scanner(System.in)) {
         int wordCount = scnr.nextInt();

         ArrayList<String> words = new ArrayList<String>();

         for (int i = 0; i < wordCount; i++) {
            words.add(scnr.next());
         }

         for (int j = 0; j < words.size(); j++) {
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
               if (words.get(j).equals(words.get(i))) {
                  count++;
               }
            }
            System.out.println(words.get(j) + " - " + count);
         }
      } 
   }
}

