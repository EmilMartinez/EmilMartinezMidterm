
package string.problems;
import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */

public class DuplicateWord {



    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language"+
                    "Java is also an Island of Indonesia" +
                    "Java is widely used language";


         String newStr = st.toLowerCase().replace(".","");
         List<String> list = Arrays.asList(newStr.split(""));
         Set<String> uniqueList = new HashSet<String>(list);
         int totalLength = 0;
         for(String s: uniqueList) {
             int numOfoccurrences = Collections.frequency(list, s);
             if(numOfoccurrences > 1) {
                 System.out.println(("\"" + s + "\"" + " occurs " + numOfoccurrences + " times."));

                 totalLength += s.length() * numOfoccurrences;
             }

             System.out.println("Average length of words: " + (float) totalLength / list.size());







        }


    }

}




