/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oops;

/**
 *
 * @author sp
 */
public class Currency {
    int paisa;
    public Currency(int r,int p){
        paisa=100*r+p;
    }
    public String toString(){
        int r=paisa/100;
        int p=paisa%100;
        return String.format("₹ %s.%s", r,p);
        
    }
    public static void main(String[] args) {
        Currency c1=new Currency(2,254);
        System.out.println(c1);
    }
    
}
