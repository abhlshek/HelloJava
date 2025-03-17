package LinkedList;

import java.util.*;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Virat");
        ll.add("Harsh");
        ll.add("Amit");
        System.out.println(ll);
       //Removing specific element from arraylist 

        ll.remove("Vijay");
        System.out.println(ll);
        
        //Removing element on the basis of specific position 
        
        ll.remove(0);
        System.out.println(ll);
        
        
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Ravi");
        ll2.add("Hanumant");
        System.out.println(ll2);
         //Removing all the new elements from arraylist
        ll.removeAll(ll2);
        System.out.println(ll);
        //Removing first element from the list 
        ll.removeFirst();
        System.out.println(ll);
        //Removing first element from the list 
        ll.removeLast();
        System.out.println(ll);
         //Removing first occurrence of element from the list 
         ll.removeFirstOccurrence("Gaurav");
         System.out.println(ll);
          //Removing last occurrence of element from the list 
          ll.removeLastOccurrence("Harsh");
          System.out.println(ll);
          //Removing all the elements available in the list 
          ll.clear();
          System.out.println(ll);
         
                
        
    }

}
