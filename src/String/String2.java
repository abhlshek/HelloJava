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
public class String2 {

    public static void main(String[] args) {
        //compare
        String name1 = "tony";
        String name2 = "tony";
        
        //case1 s1>s2  :  +ve value
        //case2 s1==s2 :  0
        //case3 s2<s2  :  -ve value
       

        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
            
        }else{
            System.out.println("string are not equal");
        }
    }

}
