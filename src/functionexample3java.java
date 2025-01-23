/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
import java.util.*;
public class functionexample3java {
    public static int printAverage(int a,int b,int c){
       int average=(a+b+c)/2; 
       return average;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("averag of 3 num"+ printAverage(a,b,c));
        
    }
    
}
