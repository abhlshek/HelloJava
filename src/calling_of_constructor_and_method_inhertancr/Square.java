/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calling_of_constructor_and_method_inhertancr;

/**
 *
 * @author sp
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(int n) {
        super(n);
    }

    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println(s1);
        System.out.printf("%s,Area=%s,Diagonal=%s,Perimeter=%s\n",s1,s1.area(),s1.diagonal(),s1.perimeter());
        System.out.printf("%s,Area=%s,Diagonal=%s,Perimeter=%s\n",s1,s1.area(),s1.diagonal(),s1.perimeter());


        //Square s2 = new Square(3);


    }

}
