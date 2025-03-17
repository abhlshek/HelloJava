/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oops;

/**
 *
 * @author sp
 */
public class Book1 {
    String bookname,subject;
    int price;
    public Book1(String b,String s,int p){
        bookname=b;
        subject=s;
        price=p;
    }
    public String toString(){
        return String.format("Book Name=%s,Subject=%s,Price=%s",bookname,subject,price);
    }
    public static void main(String[] args) {
        Book1 b1=new Book1("basic c","c",120);
        System.out.println(b1);
    }
    
}
