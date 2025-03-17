/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

/**
 *
 * @author sp
 */
public class SampleInterfaceAnonymousImplementation {

    public static void main(String[] args) {
        // SampleInterface si = new SampleInterface() {
        //   public void sampleMethod() {
        //      System.out.println("Method implemented using Anonymous Class");
        //  }
        // };
        // si.sampleMethod();
        SampleInterface si = new SampleInterface() {
            @Override
            public void f1() {
                System.out.println("Method F1 implemented using Anonymous Class");
            }

            @Override
            public void f2() {
                System.out.println("Method F2 implemented using Anonymous Class");
            }
        };
        si.f1();
        si.f2();
    }
}
