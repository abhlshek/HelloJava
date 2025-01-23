/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author sp //Write a program to check if a character entered by the user is a
 * vowel or consonant using the ternary operator.
 *
 */
public class tenaryexamplejava {

    public static void main(String[] args) {
        char x = 'o';
        if (!Character.isAlphabetic(x)) {
            System.out.println("Not a character");
            return;
        }
        x = Character.toLowerCase(x);

        boolean result = (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
        if (result) {
            System.out.println("Vowel");
        } else {
            System.out.println("not Vowel");
        }
    }

}
