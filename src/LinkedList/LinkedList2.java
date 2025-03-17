
package LinkedList;
import java.util.*;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<String>();
        ll.add("Abhishek");
        ll.add("sushil");
        ll.add("neeraj");
        ll.add("vinay");
        System.out.println(ll);
        ll.add(1,"rohan");
        System.out.println(ll);
        
        LinkedList<String>ll2=new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        System.out.println(ll2);
        
        LinkedList<String>ll3=new LinkedList<String>();
        ll3.add("sonam");
        ll3.add("mona");
        ll3.add("rahul");
        System.out.println(ll3);
        ll.addLast("Harsh");
        System.out.println(ll);
        
        ll.addFirst("lokesh");
        System.out.println(ll);
        
    }
    
}
