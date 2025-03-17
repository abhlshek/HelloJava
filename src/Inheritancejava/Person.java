/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritancejava;

/**
 *
 * @author sp
 */
public class Person {

    String name, address;
    int age;

    public Person(String n, String ad, int a) {
        name = n;
        address = ad;
        age = a;
    }

    public String toString() {
         return "Name= " + name + ", Address = " + address + ", Age = " + age;

    }

    public static void main(String[] args) {
        Person P =new Person("rohan","bhopal",23);
        System.out.println(P);

    }

}
