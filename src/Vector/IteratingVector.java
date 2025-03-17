
package Vector;
//import java.util.Scanner;
import java.util.Vector;
//import java.io.*;

public class IteratingVector {
    public static void main(String[] args) {
        Vector<String>v=new Vector<>();
        v.add("Geeks");
        v.add("Geeks");
        v.add(1,"for");
        System.out.println(v);
        
         // Using the Get method and the
          // for loop
          for(int i=0;i<v.size();i++){
              System.out.println(v.get(i)+" ");
              

          }
                         // Using the for each loop
                         for(String str:v){
                             System.out.println(str);
                         }



    }
    
}
