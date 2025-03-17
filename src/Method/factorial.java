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
public class factorial {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }


public static int combination(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        System.out.println(combination(5,5));
        
    }
    
}
