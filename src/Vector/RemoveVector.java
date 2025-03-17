
package Vector;
import java.util.*;
import java.io.*;

public class RemoveVector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(1);
        v.add(2);
        v.add("Geeks");
        v.add("forGeeks");
        v.add(4);
        System.out.println(v);
        
         // removing first occurrence element at 1 index
         
         v.remove(1);
         System.out.println(v);

    }
    
}
