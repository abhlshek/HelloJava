package Deque;

import java.util.*;
import java.io.*;

public class DequeIterating {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
        dq.add("is so good");
        // Iterate using Iterator interface
        // from the front of the queue
        for (Iterator itr = dq.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        // Iterate in reverse
        // sequence in a queue
        for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");

        }

    }
}
