/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassesandinterfaces;

/**
 *
 * @author sp
 */
public class Dhesus {
 private int quantity;
 public Dhesus(int quantity)
 {
 this.quantity=quantity; 
 }
 public double tax()
 {
 if(quantity<=10)
 return 0;
 if(quantity<=50)
 return (quantity-10)* 0.50;
 return 40*0.50 + (quantity-50)* 0.75;
 }
}

    

