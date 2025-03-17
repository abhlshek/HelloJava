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

public class functionexample7java {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        
        int sum= calculateSum(a,b);
        System.out.println(sum);
        
        
        
    }
    
}
