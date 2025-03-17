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
public class String1 {

    public static void main(String[] args) {
        //concatenation
        String firstName = "Tony";
        String lastName = "stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        
        //length();
        
        System.out.println(fullName.length());
        
        //charAt();
        
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

    }

}
