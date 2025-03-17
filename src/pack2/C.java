package pack2;

import pack1.A;

public class C {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.packageVar);
        System.out.println(a.privateVar);
        System.out.println(a.protectedVar);
        System.out.println(a.publicVar);

    }

}
