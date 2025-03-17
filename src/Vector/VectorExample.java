package Vector;

import java.io.*;
import java.util.*;

public class VectorExample {

    public static void main(String[] args) {
        int n = 5;     //size of the Vector

        //Declaring the Vector with initial size n;
        
        Vector<Integer> v = new Vector<Integer>(n);

        // Appending new elements at the end of the vector
        for (int i = 1; i <= n; i++) {
            v.add(i);

            // Printing elements
            System.out.println(v);

            // Remove element at index 3
           // v.remove(3);
           // System.out.println(v);
           

        }
    }

}
