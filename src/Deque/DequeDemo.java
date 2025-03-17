package Deque;

import java.util.*;
import java.io.*;

public class DequeDemo {

    public static void main(String[] args) {
        Deque<Integer> de_que = new ArrayDeque<Integer>(10);
        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
        for (Integer element : de_que) {
            System.out.println("Element:" + element);
            // clear() method
            de_que.clear();

            // addFirst() method to insert at start
            de_que.addFirst(564);
            de_que.addLast(291);
            // addLast() method to insert at end
            de_que.addLast(24);
            de_que.addLast(14);
            System.out.println("Above elements are removed now");
            // Iterator() :
            System.out.println("Elements of deque using Iterator :");
            for (Iterator itr = de_que.iterator(); itr.hasNext();) {
                System.out.println(itr.next());
                // descendingIterator() : to reverse the dequeorder
                System.out.println("Elements of deque in reverse order:");
                for (Iterator dItr = de_que.descendingIterator(); dItr.hasNext();) {
                    System.out.println(dItr.next());

                }
                // element() method : to get Head element
                System.out.println("\nHead Element using element(): " + de_que.element());

                // getFirst() method : to get Head element
                System.out.println("Head Element using getFirst():" + de_que.getFirst());
                // getLast() method : to get last element
                // getLast() method : to get last element
                System.out.println("Last Element using getLast():" + de_que.getLast());
                // toArray() method :
                Object[] arr = de_que.toArray();
                System.out.println("\n ArraySize:" + arr.length);
                System.out.println("Array elements:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("array" + arr[i]);
                }
                // peek() method : to get head
                System.out.println("\nHeadelelement:" + de_que.peek());
                // poll() method : to get head
                System.out.println("Head element poll : " + de_que.poll());
                 // push() method :
                 de_que.push(265);
                 de_que.push(984);
                 de_que.push(2365);
                  // remove() method : to get head
                  System.out.println("Head element remove : "+ de_que.remove());
                   System.out.println("The final array is: "+de_que);


                 


            }

        }

    }

}
