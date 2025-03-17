
package Vector;
import java.util.*;
import java.io.*;


public class VectorAdd {
    public static void main(String[] args) {
         // create default vector
         
         Vector v1=new Vector();
         
          // Add elements using add() method
          
          v1.add(1);
          v1.add(2);
          v1.add("geeks");
          v1.add("forGeeks");
          v1.add(3);
          System.out.println(v1);
          
           // create generic vector
           
        Vector<Integer> v2 = new Vector<Integer>();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println(v2);
           

          

         

        
    }
    
}
