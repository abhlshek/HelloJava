/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class Quadraticjava {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int x = 3;
        //double q=ax**.2+b*x+c
        double q = a * Math.pow(x, 2) + b * x + c;
        System.out.printf("q =%f\n", q);

    }

}
