/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class Triangle1 {

    int a, b, c;

    public Triangle1(int a, int b, int c) {
        this.a = a;
        //System.out.println(this);
        this.b = b;
        this.c = c;
        //System.out.println(this);

    }

    public Triangle1 currentObject() {
        return this;

    }

    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + "}";

    }

    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1(4, 5, 6);
        System.out.println(t1);
        Triangle1 x = t1.currentObject();
        x.a = 5;
        System.out.println(t1);

        System.out.println(x);
        System.out.println(t1 == x);

    }

}
