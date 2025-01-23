/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class swichexample2java {

    public static void main(String[] args) {
        int num = 12;
        String result;
        switch (num) {
            case 1:
            case 2:
            case 3:
                result = "low";
                break;
            case 4:
            case 5:
            case 6:
                result = "medium";
                break;
            default:
                result = "high";

        }
        System.out.println(result);
    }

}
