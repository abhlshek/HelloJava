/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author sp
 */
public class Recursion5 {

    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);

    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n - 2);

    }

}
