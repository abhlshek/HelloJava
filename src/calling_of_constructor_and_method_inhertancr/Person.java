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
public class Person {
    String name,address;
    int age;
    public Person(String n,String ad,int ag){
        name=n;
        address=ad;
        age=ag;
    }
    @Override
    public String toString(){
        return "Name="+name+ ",address="+address+ ",age="+age;
    }
    public static void main(String[] args) {
        Person p1=new Person("rahul","saidpur",23);
        System.out.println(p1);
        
    }
    
}
