/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagetwo;

import packageone.A;
import packagethree.*;

import static packageone.A.fStatic;

/**
 *
 * @author sp
 */
public class B {

    public static void main(String[] args) {
        packageone.A a = new packageone.A();
        a.fInstance();
        packageone.A.fStatic();
        packagethree.A b = new packagethree.A();
        b.fInstance();
        packagethree.A.fStatic();

        // A a1 = new A();
        // a1.fInstance();
        // A.fStatic();
        // fStatic();
    }

}
