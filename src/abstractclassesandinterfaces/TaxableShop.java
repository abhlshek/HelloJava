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
public class TaxableShop {

    public static void main(String[] args) {
        Dhepsi[] dhepsis = {new Dhepsi(5), new Dhepsi(10), new Dhepsi(2), new Dhepsi(3)};
        Dhesus[] dhesuses = {new Dhesus(8), new Dhesus(40), new Dhesus(60)};
        double tax = 0;
        System.out.println("\nDhepsi Taxes\n");
        for (Dhepsi dhepsi : dhepsis) {
            System.out.printf("Quantity=%s, Tax=%s\n", dhepsi.getQuantity(), dhepsi.tax());
            tax = tax + dhepsi.tax();
        }
        System.out.println("\nDhesus Taxes\n");
        for (Dhesus dhesus : dhesuses) {
            System.out.printf("Quantity=%s, Tax=%s\n", dhesus.getQuantity(), dhesus.tax());
            tax = tax + dhesus.tax();
        }
        System.out.printf("Total tax = %s\n\n", tax);

    }

}
