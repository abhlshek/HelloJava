/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author sp
 */
public class B {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.packageVar);
        System.out.println(a.privateVar);
        System.out.println(a.protectedVar);
        System.out.println(a.publicVar);

    }

}
