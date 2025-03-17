/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sp
 */
package pack1;

public class DisplayBankAccount {

    public static void main(String[] args) {
        for (BankAccount account : BankAccount.accounts()) {
            System.out.println(account);
        }
        System.out.println("\n\n");
        BankAccount.accounts()[0].balance += 1500;
        for (BankAccount account : BankAccount.accounts()) {
            System.out.println(account);
        }
    }

}
