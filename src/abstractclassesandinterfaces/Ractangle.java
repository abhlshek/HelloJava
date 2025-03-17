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
public class Ractangle {

    int l, b;
public Ractangle()
{
    this(0);
    System.out.println("Calling 0 param constructor of Rectangle");
}
   public  Ractangle(int x, int y) {
       System.out.println("calling 2 param constructor of rectangle");
      l = x;
       b = y;

  }
    public Ractangle(int x){
        this(x,x);
        System.out.println("calling 1 param constructor of rectangle");
        
    }
    public Ractangle currentObject(){
        return this;
    }
   @Override
    public String toString() {
        if (l == b) {
            return "Square: l=" + l + " , b=" + b;
        } else {
            return "Rectangle: l=" + l + " , b=" + b;
        }

    }
    public int area(){
        return l*b;
    }

    public static void main(String[] args) {
        Ractangle r=new Ractangle(10);
        System.out.println(r );
        r.area();
        System.out.println(r.area());
        Ractangle x=r.currentObject();
        x.l=5;
        System.out.println(x);
        Ractangle x1=new Ractangle(5);
        System.out.println(x1);
        Ractangle r2=new Ractangle();
        System.out.println(r2);
        
        
        

    }

}
