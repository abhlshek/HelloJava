/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/** String Reverce ;
 *
 * @author sp
 */
public class RecursionP2 {
    public static void printRev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str,idx-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        printRev(str,str.length()-1);
        
    }
    
}
