/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
import java.util.*;

public class functionexample8java {

    public static String printNumber(int num) {
        String result;
        if (num > 0) {
            result = "positive";
        } else if (num == 0) {
            result = "zero";
        } else {
            result = "negetive";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("" + printNumber(num));

    }

}
