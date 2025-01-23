/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 * /* */
import java.util.*;

public class swichexample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "sunday";
                break;
            case 2:
                dayName = "monday";
                break;
            case 3:
                dayName = "tuesday";
                break;
            case 4:
                dayName = "wednesday";
                break;
            case 5:
                dayName = "thursday";
                break;
            case 6:
                dayName = "friday";
                break;
            case 7:
                dayName = "saturday";
                break;
            default:
                dayName = "invalid";

        }
        System.out.println(dayName);

    }

}
