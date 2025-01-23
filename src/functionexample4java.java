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
public class functionexample4java {
    public static int printOddSum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%2!=0){
                sum +=i;
            }
        } 
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("sum"+ printOddSum(n));
    }
    
}
