/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class Triangle {

    int a, b, c;
    
    //constructor

    public Triangle(int side1, int side2, int side3) {
        a = side1;
        b = side2;
        c = side3;
        
    }

    //@Ovrride
    public String toString() {
        //return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + "}";

        return "Triangle{" + "a=" + a + ",b=" + b + ",c=" + c + "}";
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(4, 5, 6);
        System.out.println(t1);

    }

}
