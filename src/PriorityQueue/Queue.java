package PriorityQueue;

import java.util.*;
import java.io.*;

public class Queue {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("jai");
        queue.add("Raj");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());

        }

    }
}
