package Vector;

import java.util.*;
import java.io.*;

public class UpdateVector {

    public static void main(String[] args) {

        // Creating an empty Vector
        Vector<Integer> v = new Vector<Integer>();
        
         // Use add() method to add elements in the vector
         v.add(12);
         v.add(13);
         v.add(14);
         v.add(15);
         System.out.println(v);
         
          // Using set() method to replace 12 with 21
          
          System.out.println(v.set(1,21));
          
          System.out.println(v.set(0,11));
          System.out.println(v.set(2,15 ));
          System.out.println(v);


        

    }

}
