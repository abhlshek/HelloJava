/*
 \WAP to input a sencentce and print palindrome loade onely
 */
package String;

/**
 *
 * @author sp
 */
import java.util.*;

public class Example5 {
    // user define function to check palindrome
    boolean checkPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            rev = rev + c;
        }
        if (s.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Example5 obj = new Example5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String s = sc.nextLine().toUpperCase();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (obj.checkPalindrome(word)) {
                    System.out.println(word);
                }
                word = "";
            } else {
                word = word + c;
            }
        }
        if (obj.checkPalindrome(word)) {
            System.out.println(word);
        }
    }
}


