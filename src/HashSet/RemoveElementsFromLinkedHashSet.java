
package HashSet;

import java.util.*;
import java.io.*;
public class RemoveElementsFromLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String>hs=new LinkedHashSet<String>();
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");
         System.out.println("Initial HashSet " + hs);
          // Removing the element b
           hs.remove("B");
           System.out.println(hs);
            // Returns false if the element is not present
             System.out.println(hs.remove("AC"));





    }
    
}
