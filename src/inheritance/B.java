/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author sp
 */
public class B extends A {

    public B() {
        super(10);
        System.out.println("zero parameter construction in b)");
    }

    public static void main(String[] args) {
        new B();
    }
}
