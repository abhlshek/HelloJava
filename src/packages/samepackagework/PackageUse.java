package packages.samepackagework;

import packages.differentpackagework.*;
import static java.lang.Math.*;

public class PackageUse {

    /*
    import p1.*; All classes in package p1 are imported.
    import p1.A only A is imported
    import  static java.lang.Math.*; imports all things static in Math class
     */
    public static void main(String[] args) {
        Math.pow(3, 4);
        pow(2, 3);

        A a = new A();
        B b = new B();
        a.instanceFunction();
        b.instanceFunction();
        A.staticFunction();
        B.staticFunction();

        packages.differentpackagework.A a1 = new packages.differentpackagework.A();
//        B b=new B();
        a1.instanceFunction();
//        b.instanceFunction();
        packages.differentpackagework.A.staticFunction();
        //        B.staticFunction

        C c = new C();
        c.instanceFunction();
        c.staticFunction();

    }
}
