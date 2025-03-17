/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassesandinterfaces;

/**
 *
 * @author sp
 */
public class AbstractUse extends AbstractExample {
    public void f1()
    {
        System.out.println("I am f1 in Abstract Use");
    }
    public static void main(String[] args) {
        AbstractUse a1=new AbstractUse();
        a1.f1();
        AbstractExample a2=new AbstractUse();
        AbstractExample a3=new AbstractExample() ;
        AbstractUse a4=new AbstractUse();
        
        /*
        A 
        B extend A
        A a1=new A()
        A a2=new B()
        B b1=new A()
        B b2=new B()
        1. 
        */
    }

}
