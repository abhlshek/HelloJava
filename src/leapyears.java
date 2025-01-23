/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class leapyears {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for(int i=2000;i<=2024;i++){
            
        
        System.out.printf("%s = %s\n",i,isLeapYear(i));
        }
    }

}
