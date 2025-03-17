/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calling_of_constructor_and_method_inhertancr;

/**
 *
 * @author sp
 */
public class B extends A{
    public B(){
        super(10);
        System.out.println("Zero parameter construction B");
    }
    public static void main(String[] args) {
        new B();
    }
    
}
