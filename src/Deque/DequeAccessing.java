package Deque;

import java.util.*;
import java.io.*;

public class DequeAccessing {

    public static void main(String[] args) {
        ArrayDeque<String> de_que = new ArrayDeque<String>();
        // Use add() method to add elements into the Deque
        de_que.add("Welcom");
        de_que.add("To");
        de_que.add("Geeks");
        de_que.add("4");
        de_que.add("Geeks");
        System.out.println("ArrayDeque:" + de_que);
        System.out.println("The first element is:" + de_que.getFirst());
        System.out.println("The last element is:" + de_que.getLast());
        System.out.println("peek:" + de_que.peek());
        System.out.println("peekFirst:" + de_que.peekFirst());
        System.out.println("peekLast:" + de_que.peekLast());

    }

}
