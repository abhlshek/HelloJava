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
public class Person {

    String name, address;
    int age;

    public Person(String n, String ad, int ag) {
        name = n;
        address = ad;
        age = ag;
    }

    public String toString() {
        return "Name= " + name + ", Address = " + address + ", Age = " + age;
    }



    public static void main(String[] args) {
        Person p = new Person("Popat", "Gokuldham", 0);

        System.out.println(" person" + p);

    }

}
