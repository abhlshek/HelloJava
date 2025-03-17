// Java program to demonstrate the removing
// of the elements from the stack
package Stack;

import java.util.*;
import java.io.*;

public class Stack_Remove {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        // Use add() method to add elements
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);
        System.out.println(stack);
        // Removing elements using pop() method
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

    }

}
