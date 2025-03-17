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
public class Book {
    String bookname,subject;
    int price;
    public Book(String b,String s,int p){
        bookname=b;
        subject=s;
        price=p;
    }
    public void display(){
         System.out.printf("Book Name=%s, Subject=%s,Price=%s\n",bookname,subject,price);
        
    }
    public static void main(String[] args) {
        Book b1=new Book("basic c","c",150);
        b1.display();
        
    }
    
}
