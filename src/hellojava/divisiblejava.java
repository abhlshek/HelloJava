/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author sp
 */
import java.util.*;
public class divisiblejava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("id divisible by 5 and 11"+" ," + num);
        }else{
            System.out.println("not divisible");
        }
        
    }
    
}
