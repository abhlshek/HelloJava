/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author sp
 */
public class printHello {
    int n;

    public static void printHello(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        printHello(5);

    }

}
