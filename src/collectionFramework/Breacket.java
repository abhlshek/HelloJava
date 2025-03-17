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

public class Breacket {

    public static void main(String[] args) {
        java.util.Stack<Character> Stack = new java.util.Stack<>();
        String ex = "(a+b))";
        for (int i = 0; i < ex.length(); i++) {
            char x = ex.charAt(i);
            System.out.println(x);
            if (x == '(') {
                Stack.push(x);
                continue;
            }
            if (x == ')') {
                if (Stack.empty()) {
                    System.err.println("Invalid expression");
                    return;
                }
                Stack.pop();
            }

        }
        if (Stack.empty()) {
            System.out.println("Valid expression");
            return;
        } else {
            System.err.println("Invalid expression");
            return;
        }

    }

}
