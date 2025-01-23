/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class hello {
    public static void printHello(int n,String s){
        for(int i=1;i<=n;i++){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        printHello(1,"hi");
        printHello(0,"hello");
        printHello(3,"bye");

        
    }
    
}
