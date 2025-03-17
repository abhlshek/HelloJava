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
public class functionexample1java {
    public static int calculaterProduct(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println("product of 2 num is:"+ calculaterProduct(a,b));
        
    }
    
}
