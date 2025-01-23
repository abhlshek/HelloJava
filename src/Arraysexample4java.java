/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
//take an array as inpput from the user.Search for a given number X and print the index at which it occurs.


import java.util.*;

public class Arraysexample4java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        // input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt(); //liner search
        //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x found at index:"+i);
            }
        }
        
        
        
    }
    
}
