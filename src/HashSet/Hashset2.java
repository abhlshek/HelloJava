
package HashSet;
import java.util.*;


public class Hashset2 {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajsy");
        //Traversing elements 
        Iterator<String>itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
