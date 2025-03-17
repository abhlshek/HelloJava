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
public class Square extends Ractangle {

    public Square(int side) {
        super(side, side);
    }
    public static void main(String[] args) {
        Square s=new Square(4);
        System.out.println(s);
        
    }

}
