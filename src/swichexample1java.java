/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
//2. Using String with Switch (Java 7 and above)

import java.util.Scanner;

public class swichexample1java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        String season;
        switch (month) {
            case "December":
            case "january":
            case "February":
                season = "winter";
                break;
            case "March":
            case "April":
            case "May":
                season = "Spring";
                break;
            case "June":
            case "July":
            case "August":
                season = "Summer";
                break;
            case "September":
            case "October":
            case "November":
                season = "Autumn";
                break;
            default:
                season = "invalid";

        }
        System.out.println(season);

    }

}
