/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package This_Reference_Variable;

/**
 *
 * @author sp
 */
public class Triangle1 {

    int a, b, c;

    public Triangle1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        System.out.println(this);

        this.c = c;
        System.out.println(this);

    }
    public Triangle1 currentObject(){
        return this;
    }

    public String toString() {
        return "Triangle1{" + "a=" + a + ",b=" + b + ",c=" + c + "}";
    }

    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1(4, 5, 6);
       // System.out.println(t1);
       // System.out.println(t1.currentObject());
        Triangle1 x=t1.currentObject();
        x.a=5;
        System.out.println(t1);
        System.out.println(x);
        System.out.println(t1==x);



        

    }

}
