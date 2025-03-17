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
public class Recursion2 {

    public static void printNum(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);

    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n);

    }

}
