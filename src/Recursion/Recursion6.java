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
public class Recursion6 {
    public static int calcPower(int x,int n){
        if(n==0){ //base case1
            return 1;
        }
        if(x==0){// base case2
            return 0;
        }
        
        
        
        int xpow_nm1=calcPower(x,n-1);
        int xpow_n=x*xpow_nm1;
        return xpow_n;
        
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
        
    }
    
}
