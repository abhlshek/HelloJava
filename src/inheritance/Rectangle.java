/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author sp
 */
public class Rectangle {

    int l, b;

    public Rectangle() {
        System.out.println("Zero parameter construction in Rectangle");
        l = 0;
        b = 0;

    }

    public Rectangle(int x) {
        System.out.println("One parameter construction in Rectangle");
        l = x;
        b = x;

    }

    public Rectangle(int x, int y) {
        System.out.println("Two parameter construction in Rectangle");
        l = x;
        b = y;

    }

    public int perimeter() {
        return 2 * l + 2 * b;

    }

    public int area() {
        return l * b;
    }

    public double diagonal() {
        return Math.sqrt(l * l + b * b);

    }

    public String toString() {
        //return "Rectangle: l=" + l + " , b=" + b;
        if (l == b) {
            return "Square: l=" + l + " , b=" + b;
        } else {
            return "Rectangle: l=" + l + " , b=" + b;
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(5);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(3, 5);
        System.out.println(r3);
        System.out.printf("%s,Area=%s,Diagonal=%s,Perimeter=%s\n", r1, r1.area(), r1.diagonal(), r1.perimeter());
        System.out.printf("%s,Area=%s,Diagonal=%s,Perimeter=%s\n",r2,r2.area(),r2.diagonal(),r2.perimeter());
        System.out.printf("%s,Area=%s,Diagonal=%s,Perimeter=%s\n",r3,r3.area(),r3.diagonal(),r3.perimeter());


    }

}
