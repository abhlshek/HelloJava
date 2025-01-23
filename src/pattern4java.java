/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class pattern4java {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop space
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            //inner loop-> star print
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
    }
    
}
