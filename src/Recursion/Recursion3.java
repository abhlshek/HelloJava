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
public class Recursion3 {

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += 1;
        printSum(i+1, n, sum);
       // System.out.println(i);

    }

    public static void main(String[] args) {
        printSum(1,5,0);

    }

}
