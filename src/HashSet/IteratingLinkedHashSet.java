
package HashSet;

import java.util.*;
import java.io.*;
public class IteratingLinkedHashSet {
    public static void main(String[] args) {
        Set<String>hs=new LinkedHashSet<String>();
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");
         // Iterating though the LinkedHashSet
         Iterator itr=hs.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next()+"");
             System.out.println();
              //Object
               // Using enhanced for loop
               for(String s:hs){
                   System.out.println(s+" ");
               }


             
         }

        
    }
    
}
