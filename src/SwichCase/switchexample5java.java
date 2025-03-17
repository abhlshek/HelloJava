/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class switchexample5java {

    public static void main(String[] args) {
        int years = 2024;
        String result;
        switch (years) {
            case 1:
                if ((years % 4 == 0) && (years % 100 != 00) || (years % 400 == 0)) {
                    result = "leapyears";
                }

                break;
            default:
                result = "invalid";

        }
        System.out.println(result);
    }

}
