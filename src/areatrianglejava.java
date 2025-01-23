/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class areatrianglejava {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int s = 100;
        double si = (a + b + c) / 2;
        System.out.printf("s %f\n", si);
        //double area =( s*(s-a)(s-b)(s-c))**.5;
        double area = Math.pow((s * (s - a) * (s - b) * (s - c)), 5);
        System.out.printf("area %f\n", area);
        );
    }
}
