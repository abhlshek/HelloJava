/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class cisijava {

    public static void main(String[] args) {
        int p = 100;
        int r = 3;
        int t = 3;
        double si = p * r * t / 100;
        double ci = p * Math.pow(1 + r / 100.0, t) - p;
        System.out.printf("si= %3.2f, ci=%3.2f\n", si, ci);
        // Math.pow(a,b)

    }

}
