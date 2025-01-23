/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class Factorial {

    public static int printFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int combination(int n, int r) {
        return printFactorial(n) / (printFactorial(r) * printFactorial(n - r));
    }

    public static void main(String[] args) {
        System.out.println(combination(5, 2));
        System.out.println(combination(5, 5));

    }

}
