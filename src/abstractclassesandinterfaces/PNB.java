/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassesandinterfaces;

import inheritance.AbstractAccount;

/**
 *
 * @author sp
 */
public class PNB extends AbstractAccount {
    public void deposit(){
        System.out.println("PNB.deposit()");
    }
    
    
    public static void main(String[] args) {
        System.out.println("PNB.main()");
        
        
        
    }
}
