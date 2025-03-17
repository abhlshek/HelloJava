/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritancejava;

/**
 *
 * @author sp
 */
public class B extends A{
    String x="Stribg variable in class B";
    public void print(){
        System.out.println(super.x );
    }
    public static void main(String[] args) {
        B b1=new B();
        b1.print();
        
    }
    
}
