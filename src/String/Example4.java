/*

WAp to input sentence change to UpperCase and print the no of word Startin &
ending with vowels

 */
package String;

/**
 *
 * @author sp
 */
import java.util.*;
public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentance");
        String s=sc.nextLine().toUpperCase();
        System.out.println(s);
        //extre space is added to split word
        s= s+" ";
        String word="";//Store the word
        int start=0, count=0;
        for(int i=0; i<s.length();i++){
            char c =s.charAt(i);
            if(c==' '){
                word = s.substring(start, i);
                start =i+1;
                //System.out.println(word);
                char c1=word.charAt(0);  //startchar
                char c2=word.charAt(word.length()-1); //ending
                if(c1=='A'|| c1=='E' || c1=='I' || c1=='O' || c1=='U')                                
                
                
               if(c2=='A'|| c2=='E' || c2=='I' || c2=='O' || c2=='U') 
                count ++;
                        

                
            }
        }
        System.out.println(count);
        
        
    }
    
}
