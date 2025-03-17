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
public class Recursion4 {

    public static int calcfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_nm1 = calcfactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n=5;
        int ans=calcfactorial(n);
        System.out.println(ans);

    }

}
