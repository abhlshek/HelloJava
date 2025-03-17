/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class Rectangle1 {

    int length, width;

    public Rectangle1(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle1{" + "length=" + length + ",width=" + width + "}";

    }

    public static void main(String[] args) {
        Rectangle1 R=new Rectangle1(20,30);
        System.out.println(R);

    }

}
