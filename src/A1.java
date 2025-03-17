/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sp
 */
//package packageone;

package packagethree;

public class A1 {

    public static void fStatic() {
        System.out.println("Static function in class A in packageone");
    }

    public void finstance() {
        System.out.println("Static function in class A in packageone");
    }

    public static void main(String[] args) {
        A1 a = new A1();
        a.finstance();
        A1.fStatic();

    }

}
