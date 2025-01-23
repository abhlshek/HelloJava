/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negative;

/**
 *
 * @author sp
 */
public class leapyearjava {
    public static void main(String[] args) {
        int years=2024;
        if((years%4==0 && years%100!=0)||(years%400==0)){
            System.out.println("leapyear" + years);
        }else{
            System.out.println("not leapyear" + years);
        }
    }
    
}
