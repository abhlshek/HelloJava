// Java program to demonstrate the
// addition of elements in ArrayDeque
package Deque;
import java.util.*;
import java.io.*;

public class DequeAdd {
    public static void main(String[] args) {
 Deque<String>dq = new ArrayDeque<String>(); 
  // add() method to insert
dq.add("the");
dq.add("to");
dq.add("Geeks");
        System.out.println("Add:"+dq);
         // offer() method to insert
dq.offer("For");
dq.offer("Welcome");
dq.offer("Geeks");
        System.out.println("Offer:"+dq);

  
    }
    
}
