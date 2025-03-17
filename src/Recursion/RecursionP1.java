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
public class RecursionP1 {

    public static void towerofHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerofHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerofHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 2;
        towerofHanoi(n, "S", "H", "D");

    }

}
