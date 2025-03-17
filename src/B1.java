/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sp
 */
package packagetwo;

import packageone.*;
//import packageone.A1;
//import packagethree.A1;
//import static packageone.A1.fStatic;

public class B1 {

    public static void main(String[] args) {
        //method
        //packageone.A1 a=new packageone.A1();
        // a.finstance();
        // packageone.A1.fStatic();

        //method
        //A1 a = new A1();
        //a.finstance();
        //A1.fStatic();
        //method
        ///packageone.A1 a = new packageone.A1();
        //a.finstance();
        //packageone.A1.fStatic();
        packagethree.A1 b = new packagethree.A1();
        b.finstance();
        packagethree.A1.fStatic();

    }

}
