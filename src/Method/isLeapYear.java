/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author sp
 */
public class isLeapYear {

    // int year;
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static int getDaysinMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;

                } else {
                    return 28;
                }
            default:
                return 31;

        }
    }

    public static void main(String[] args) {
        //isLeapYear(2024);
        System.out.println(isLeapYear(2025));
        System.out.println(getDaysinMonth(5,2001));

    }

}
