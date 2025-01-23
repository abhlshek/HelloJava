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
public class functionexample5java {
    public static double printCircumference(int r){
        double circumference =2*3.14*r;
        return circumference;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("circumference"+ printCircumference(r));
        
    }
    
}
