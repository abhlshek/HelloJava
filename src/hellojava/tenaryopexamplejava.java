/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author sp
 */
public class tenaryopexamplejava {

    public static void main(String[] args) {
        // even and odd number

        //int num=15;
        //String result=(num%2==0)? "even":"odd";
        // System.out.println(result);
        //largest of two numbers
        // int a=10,b=11;
        //String result=(a>b)? a +"is larger": b+", b is larger";
        // System.out.println(result);
        //leap year
        
        //int years=2024;
        //String result=((years%4==0 && years%100!=0) || (years%400==0))? years +"leapyrae": years+"not leaoyesr";
        //System.out.println(result);
        //divisible both 2 and 3 using a ternary operator
        //int num=10;
        //String result=(num%3==0 && num%2==0)? num +"divisible":num+"notdivisible";
        //System.out.println(result);
        //positive negative zero
        //int number=10;
        //String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        //System.out.println(result);
        
        
        //3 num max
        Integer a = 92, b = 3, c = 4;
        // int result=(a>=b && a>c)? a:(b>a && b>c)? b:c;
        String result = (a >= b && a > c) ? "Max a= "+ a : (b > a && b > c) ? ""+ b :""+c;
          //String result = (a >= b && a > c) ? a.toString() : (b > a && b > c) ? ""+ b :""+c;


        System.out.printf("%s\n", result);
    }

}
