/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negative;

/**
 *
 * @author sp
 */
public class eligibledrivejava {
    public static void main(String[] args) {
        int age=18;
        boolean hasLicense=true;
        if(age>=10){
            if(hasLicense){
                System.out.println("you are eligible to drive");
            }else{
                System.out.println("you need eligible license to drive");
            }
        }else{
            System.out.println("you are not old enough to drive");
        }
    }
    
}
