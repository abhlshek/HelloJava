// Java program to add the
// elements in the stack
package Stack;

import java.util.*;
import java.io.*;

public class StackAccessing {
    // Main Method

    public static void main(String[] args) {
        // Main Method
        Stack<String> stack = new Stack<String>();
        // Use push() to add elements into the Stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        // Displaying the Stack
        System.out.println("Initial Stack:"+stack);

        // Fetching the element at the head of the Stack
        System.out.println(stack.peek());
        
        System.out.println("Final Stack:"+stack);

    }

}
