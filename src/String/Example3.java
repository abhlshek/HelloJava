/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 * WAP to input a word and reverse it;
 *
 * @author sp
 */
import java.util.*;

public class Example3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word");

        String word = sc.nextLine();
       // String rev="";
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            //rev +=c;
            //System.out.println("reverce " +rev);
            
            System.out.print(c);
        }

    }

}
