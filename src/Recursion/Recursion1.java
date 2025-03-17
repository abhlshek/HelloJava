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
public class Recursion1 {
    public static void printNumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNumb(n);
        
    }
    
}
