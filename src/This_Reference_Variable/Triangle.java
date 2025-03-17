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
public class Triangle {
    int a,b,c;
    public Triangle(int side1,int side2,int side3){
        a=side1;
        b=side2;
        c=side3;
    }
    @Override
    public String toString(){
        return "Triangle{"+"a="+a+ ",b="+b+ ",c="+c+"}";
    }
    public static void main(String[] args) {
        Triangle t1=new Triangle(2,3,4);
        System.out.println(t1);
        
    }
    
}
