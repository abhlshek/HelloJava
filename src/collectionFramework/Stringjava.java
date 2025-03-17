/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionFramework;

/**
 *
 * @author sp
 */

public class Stringjava {
    public static void main(String[] args) {
        String firstName="johan";
        String lastName="Doe";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        
        //substring
        
        String substring=fullName.substring(0,4);  //substring(bigning index,ending index);
        
        System.out.println(substring);     //output-> johan
        
        
        //Equality();
        
        boolean isEqual=firstName.equals(lastName);
        System.out.println(isEqual);//output->false
        
        //equalsIgnoreCase();
        
        boolean isEqualIgnoreCase=firstName.equalsIgnoreCase(lastName);
        System.out.println(isEqualIgnoreCase);//output ->false
        
        
        //Searching :
        //1.indexof();
        
        int indexofjava=fullName.indexOf("Doe");
        System.out.println(indexofjava);
        
        // String formating
        
        int age=25;
        System.out.printf("My name is %s, and I am %d years old.\n", fullName, age);
        
        //StreingBuilder:
        
        StringBuilder mutableString=new StringBuilder("Hello");
        mutableString.append("java");
        System.out.println(mutableString);
      
        
        
        
        //StringBuffer-> `StringBuffer` is similar to `StringBuilder` but is thread-safe.
        
        
        
        
        
    }
    
}
