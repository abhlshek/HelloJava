package Exception_Handling;

import java.util.*;

public class ExceptionHandlingRoute {

    public static void main(String[] args) {
        System.out.println("Starting Main");
        f1();
        System.out.println("Ending Main");

    }
    public static void f1() {
        System.out.println("Starting F1");
        f2();
        System.out.println("Ending F1");

    }

    public static void f2() {
        System.out.println("Starting F2");
        f3();
        System.out.println("Ending F2");
    }

    public static void f3() {
        System.out.println("Starting F3");
        int n = 0;
        n = n / n;
        System.out.println("Ending F3");
    }

}
