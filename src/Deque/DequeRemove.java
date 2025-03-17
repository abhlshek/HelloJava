package Deque;

import java.util.*;
import java.io.*;

public class DequeRemove {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("one");
        dq.addFirst("two");
        dq.addLast("Three");
        System.out.println(dq);
        System.out.println(dq.pop());//first element remove
        System.out.println(dq);
        // remove element as a queue from front

        System.out.println(dq.poll());
        System.out.println(dq);
         // remove element from front
          System.out.println(dq.pollFirst());
           // remove element from back
            System.out.println(dq.pollLast());



         



    }

}
