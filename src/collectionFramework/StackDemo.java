/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionFramework;

/**
 *
 * @author sp
 */
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        //Stack<String> stack=new  Stack<String>();
        Stack<String>stack=new Stack();
        stack.push("apple");
        stack.push("Ball");
        stack.push("Cat");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        stack.pop();
        System.out.println(stack);

    }

}
