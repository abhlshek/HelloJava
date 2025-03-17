/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionFramework;

import java.util.Stack;

/**
 *
 * @author sp
 */
public class StackDemo1 {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            st.push(i);
        }

        while (!st.empty()) {
            int x = st.pop();
            System.out.print(x + ",");
        }
        System.out.println();
    }

}
