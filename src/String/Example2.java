/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *WAP to input a word and count the number of vowels present in the word;
 * @author sp
 */
import java.util.*;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=sc.nextLine();
        word=word.toUpperCase();
        
        int count=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U')
                count++;
                
            
        }
        System.out.println("No of vowels " + count);
        
        
    }
    
}
