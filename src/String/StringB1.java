package String;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class StringB1 {

    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder("tony");
        //System.out.println(sb);
        //index 1
        //System.out.println(sb.charAt(1));

        //sb.setCharAt(0, 'p');
        //System.out.println(sb);
       // sb.insert(0, 's');
        //System.out.println(sb);
        //sb.insert(2, 'n');
        //System.out.println(sb);
        //deleted
        // sb.delete(2,3);
         //System.out.println(sb);
        //append
        StringBuilder sb = new StringBuilder("h");
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        System.out.println(sb);
        //StringBuilder sb = new StringBuilder("hello");
        //for(int i=0;i<sb.length();i++){
         //   int front=i;
          //  int back=sb.length()-1-i;
          //  char frontChar=sb.charAt(front);
          //  char backChar=sb.charAt(back);
          //  sb.setCharAt(front, backChar);
           // sb.setCharAt(back, frontChar);
            
            
        //}   
        //System.out.println(sb);

    }

}
